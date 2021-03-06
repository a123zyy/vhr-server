package org.example.vhr.controller.webcontroller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang3.StringUtils;
import org.example.vhr.*;
import org.example.vhr.controller.ControllerRequest.EmployeeRequest;
import org.example.vhr.controller.until.Result;
import org.example.vhr.controller.until.ResultMsg;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;


import java.util.Objects;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/employee/basic")
@CrossOrigin(origins = "*")
@CacheConfig()

public class EmpBasicController {
    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private NationService nationService;

    @Autowired
    private PoliticsstatusService politicsstatusService;
    @Autowired
    private PositionService positionService;
    @Autowired
    private JoblevelService joblevelService;
    @Autowired
    private DepartmentService departmentService;



    @PostMapping("/")
    @Cacheable(value = "empListCache", key = "'emp_list_test'+#employeeRequest.pageNo+#employeeRequest.name")
    public Result getEmpBasic(@RequestBody EmployeeRequest employeeRequest){
        EmployeeExample employeeExample = new EmployeeExample();
        employeeExample.setOrderByClause("id");
        if (!StringUtils.isBlank(employeeRequest.getName())){
            employeeExample.or().andNameLike("%"+employeeRequest.getName()+"%");
        }
        PageHelper.startPage(employeeRequest.getPageNo(),employeeRequest.getPageSize(),true);
        PageInfo<Employee> pageInfo = new PageInfo<Employee>(employeeService.selectByExample(employeeExample));
        employeeRequest.setData(pageInfo.getList().stream().map(this::getEmployee).collect(Collectors.toList()));
        employeeRequest.setTotal(pageInfo.getTotal());
        return Result.success(employeeRequest);
    }

    @PutMapping("/")
    @CachePut
    public Result addEmployeeRequest(@RequestBody EmployeeRequest request){
        if (Objects.isNull(request)){
            return Result.error(ResultMsg.MISSING_ROOT_ERR);
        }
        try {
            if (Objects.nonNull(request.getDepartment())){
                departmentService.updateByPrimaryKey(request.getDepartment());
            }
            if (Objects.nonNull(request.getJobLevel())){
                joblevelService.updateByPrimaryKey(request.getJobLevel());
            }
            if (Objects.nonNull(request.getNation())){
                nationService.updateByPrimaryKey(request.getNation());
            }
            if (Objects.nonNull(request.getPoliticsstatus())){
                politicsstatusService.updateByPrimaryKey(request.getPoliticsstatus());
            }
            if (Objects.nonNull(request.getPosition())){
                positionService.updateByPrimaryKey(request.getPosition());
            }
            employeeService.insert(request);
        } catch (Exception e){
            new Error();
        }
        return Result.success("success");
    }
    @PatchMapping("/")
    @CachePut
    public Result updateEmployeeRequest(@RequestBody EmployeeRequest request){
        if (Objects.isNull(request)){
            return Result.error(ResultMsg.MISSING_ROOT_ERR);
        }
        try {
            if (Objects.nonNull(request.getDepartment())){
                departmentService.updateByPrimaryKey(request.getDepartment());
            }
            if (Objects.nonNull(request.getJobLevel())){
                joblevelService.updateByPrimaryKey(request.getJobLevel());
            }
            if (Objects.nonNull(request.getNation())){
                nationService.updateByPrimaryKey(request.getNation());
            }
            if (Objects.nonNull(request.getPoliticsstatus())){
                politicsstatusService.updateByPrimaryKey(request.getPoliticsstatus());
            }
            if (Objects.nonNull(request.getPosition())){
                positionService.updateByPrimaryKey(request.getPosition());
            }
            employeeService.updateByPrimaryKey(request);
        } catch (Exception e){
            new Error();
        }
        return Result.success("success");
    }
    /**
     * 删除员工 相应的工资表和奖惩表对应也需要删掉
     * */
    @DeleteMapping("/{id}")
    public Result deleteEmp(@PathVariable int id){
        return Result.success(employeeService.deleteByID(id));
    }

    @GetMapping("/nations")
    public Result getNations(){
      return Result.success(nationService.selectByExample(new NationExample()));
    }
    //党派
    @GetMapping("/politicsstatus")
    public Result getPoliticsstatus(){
        return Result.success(politicsstatusService.selectByExample( new PoliticsstatusExample()));
    }
    //职位
    @GetMapping("/positions")
    public Result getpositions(){
        return Result.success(positionService.selectByExample(new PositionExample()));
    }
    //职称
    @GetMapping("/joblevels")
    public Result getjoblevels(){
        return Result.success(joblevelService.selectByExample(new JoblevelExample()));
    }
    //部门

    @GetMapping("/deps")
    public Result getdeps(){
        return Result.success(departmentService.findAllByParendId());
    }
    @GetMapping("/maxWorkID")
    public Result getMaxWorkID(){
      return Result.success(employeeService.getMaxWorkID());
    }

    private EmployeeRequest getEmployee(Employee employee){
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
