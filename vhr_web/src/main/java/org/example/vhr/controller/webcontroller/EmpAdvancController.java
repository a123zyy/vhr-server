package org.example.vhr.controller.webcontroller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.example.vhr.DepartmentService;
import org.example.vhr.Employee;
import org.example.vhr.EmployeeExample;
import org.example.vhr.EmployeeService;
import org.example.vhr.JoblevelService;
import org.example.vhr.NationService;
import org.example.vhr.PoliticsstatusService;
import org.example.vhr.Position;
import org.example.vhr.controller.ControllerRequest.*;
import org.example.vhr.PositionService;
import org.example.vhr.controller.until.Result;
import org.example.vhr.controller.until.ResultController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author zyy
 */
@RestController
@RequestMapping("/employee/advanc")
@CrossOrigin(origins = "*")
@CacheConfig()
public class EmpAdvancController {

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


    @GetMapping("/")
    public Result advancEmp(int pageSize,int pageNum){
        PageHelper.startPage(pageNum,pageSize,true);
        List<Employee> empAdvancs =  employeeService.selectByExample(new EmployeeExample());
        PageInfo<Employee> advancRequestList = new PageInfo<Employee>(empAdvancs);
        ResultController resultController = new ResultController();
        resultController.setList(advancRequestList.getList().stream().map(item->{
            EmpAdvancRequest empAdvancRequest = new EmpAdvancRequest();
            empAdvancRequest.setId(item.getId());
            empAdvancRequest.setDeptId(item.getDepartmentId());
            empAdvancRequest.setDeptName(departmentService.selectByPrimaryKey(item.getDepartmentId()).getName());
            empAdvancRequest.setEmail(item.getEmail());
            empAdvancRequest.setPositionID(item.getPoliticId());
            Position position =  positionService.selectByPrimaryKey(item.getPosId());
            if (position != null && position.getId() != null){
                empAdvancRequest.setPositionName(position.getName());
                empAdvancRequest.setPositionType(position.getPositionType() == null?
                        "暂无":(position.getPositionType() == 0?
                        "实习":(position.getPositionType() == 1?
                        "初级":(position.getPositionType() == 2?"中级":"高级"))));

            }
            empAdvancRequest.setUsername(item.getName());
            empAdvancRequest.setMonth(getmonth(item.getBeginContract()));
            return empAdvancRequest;
        }).collect(Collectors.toList()));
        resultController.setPageNo(pageNum);
        resultController.setPageSize(pageSize);
        resultController.setTotal(advancRequestList.getTotal());
        return Result.success(resultController);
    }

    private Long getmonth(Date data){
        if (data == null){
            return 0L;
        }
        Date now = new Date();
        long l = now.getTime() - data.getTime();
        long day = l / (24 * 60 * 60 * 1000);
        long hour = (l / (60 * 60 * 1000) - day * 24);
        return  hour;
    }


}

