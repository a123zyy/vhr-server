package org.example.vhr.controller.webcontroller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.example.vhr.*;
import org.example.vhr.controller.ControllerRequest.EmployeeRequest;
import org.example.vhr.controller.ControllerRequest.RewardAndPunishmentRequest;
import org.example.vhr.controller.config.checkConfig;
import org.example.vhr.controller.config.enums.RewardAndPunishmentEnum;
import org.example.vhr.controller.until.Result;
import org.example.vhr.controller.until.ResultController;
import org.example.vhr.controller.until.ResultMsg;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Id;
import javax.validation.Valid;
import java.util.Date;

@RestController
@RequestMapping("/rewardAndPunish")
@CrossOrigin(origins = "*")
public class RewardAndPunishController {

    @Autowired
    public RewardAndPunishmentService punishmentService;

    @Autowired
    public EmployeeService employeeService;

    @Autowired
    public DepartmentService departmentService;
    @Autowired
    public JoblevelService joblevelService;
    @Autowired
    public NationService nationService;
    @Autowired
    public PoliticsstatusService politicsstatusService;
    @Autowired
    public PositionService positionService;

    @GetMapping("/")
    public Result getRewardAndPunish(int pageSize,int pageNum){
        RewardAndPunishmentExample example = new RewardAndPunishmentExample();
        example.setOrderByClause("create_date desc");
        example.or().andStatusNotEqualTo(RewardAndPunishmentEnum.CANCEL_STATUS.val);
        PageHelper.startPage(pageNum,pageSize,true);
        PageInfo<RewardAndPunishment> pageInfo = new PageInfo<RewardAndPunishment>(punishmentService.selectByExample(example));
        ResultController resultController = new ResultController();
        resultController.setList(pageInfo.getList());
        resultController.setTotal(pageInfo.getTotal());
        return Result.success(resultController);
    }

    @PostMapping("/add")
    @Validated
    public Result add(@RequestBody @Valid RewardAndPunishmentRequest andPunishmentRequest){
        if (andPunishmentRequest == null){
            return Result.error(ResultMsg.CLASS_NOT_FOUND_ERR);
        }
        if (andPunishmentRequest.getRewardPunishmentType() == null ||andPunishmentRequest.getEmpId() == null || andPunishmentRequest.getImplementationData() == null){
            return Result.error(ResultMsg.CLASS_NOT_FOUND_ERR);
        }
        //校验参数
        checkConfig.doValidator(andPunishmentRequest);
        EmployeeRequest EmployeeRequest =  getEmployeeRequest(andPunishmentRequest.getEmpId());
        andPunishmentRequest.setEmpName(EmployeeRequest.getName());
        andPunishmentRequest.setDeptId(EmployeeRequest.getDepartmentId());
        andPunishmentRequest.setDeptName(EmployeeRequest.getDepartment().getName());
        andPunishmentRequest.setPositionId(EmployeeRequest.getPoliticId());
        andPunishmentRequest.setPositionName(EmployeeRequest.getPosition().getName());

        RewardAndPunishment rewardAndPunishment = new RewardAndPunishment();
        BeanUtils.copyProperties(andPunishmentRequest,rewardAndPunishment);
        rewardAndPunishment.setStatus(RewardAndPunishmentEnum.NO_STATUS.val);
        punishmentService.insertSelective(rewardAndPunishment);
        return Result.success("成功");

    };

    @PostMapping("/update")
    @Validated
    public Result update(@RequestBody @Valid RewardAndPunishmentRequest andPunishmentRequest){
        if (andPunishmentRequest == null){
            return Result.error(ResultMsg.CLASS_NOT_FOUND_ERR);
        }
        if (andPunishmentRequest.getRewardPunishmentType() == null ||andPunishmentRequest.getEmpId() == null || andPunishmentRequest.getImplementationData() == null){
            return Result.error(ResultMsg.CLASS_NOT_FOUND_ERR);
        }
        checkConfig.doValidator(andPunishmentRequest);
        EmployeeRequest EmployeeRequest =  getEmployeeRequest(andPunishmentRequest.getEmpId());
        andPunishmentRequest.setEmpName(EmployeeRequest.getName());
        andPunishmentRequest.setDeptId(EmployeeRequest.getDepartmentId());
        andPunishmentRequest.setDeptName(EmployeeRequest.getDepartment().getName());
        andPunishmentRequest.setPositionId(EmployeeRequest.getPoliticId());
        andPunishmentRequest.setPositionName(EmployeeRequest.getPosition().getName());
        RewardAndPunishment rewardAndPunishment = punishmentService.selectByPrimaryKey(andPunishmentRequest.getId());
        BeanUtils.copyProperties(andPunishmentRequest,rewardAndPunishment);
        punishmentService.updateByPrimaryKeySelective(rewardAndPunishment);
        return Result.success("成功");
    };

    @GetMapping("/del")
    public Result delById(int id,int status){
        if (0 == id){
            return Result.error(ResultMsg.CLASS_NOT_FOUND_ERR);
        }
        RewardAndPunishment rewardAndPunishment = punishmentService.selectByPrimaryKey(id);
        rewardAndPunishment.setStatus(status);
        punishmentService.updateByPrimaryKeySelective(rewardAndPunishment);
        return Result.success("成功");
    };

    public EmployeeRequest getEmployeeRequest(int id){
        Employee employee =  employeeService.selectByPrimaryKey(id);
        EmployeeRequest employeeRequest = new  EmployeeRequest();
        BeanUtils.copyProperties(employee,employeeRequest);
        employeeRequest.setDepartment(departmentService.selectByPrimaryKey(employee.getDepartmentId()));
        employeeRequest.setJobLevel(joblevelService.selectByPrimaryKey(employee.getJobLevelId()));
        employeeRequest.setNation(nationService.selectByPrimaryKey(employee.getNationId()));
        employeeRequest.setPoliticsstatus(politicsstatusService.selectByPrimaryKey(employee.getPoliticId()));
        employeeRequest.setPosition(positionService.selectByPrimaryKey(employee.getPosId()));
        return employeeRequest;

    }



}
