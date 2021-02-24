package org.example.vhr.controller.webcontroller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.example.vhr.DepartmentService;
import org.example.vhr.Employee;
import org.example.vhr.EmployeeExample;
import org.example.vhr.EmployeeService;
import org.example.vhr.EmpsalaryService;
import org.example.vhr.SalaryExample;
import org.example.vhr.SalaryService;
import org.example.vhr.controller.ControllerRequest.EmployeeRequest;
import org.example.vhr.controller.until.Result;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/salary/sobcfg")
public class SalaryBillController {

    @Autowired
    private SalaryService salaryService;

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private DepartmentService departmentService;

    @Autowired
    private EmpsalaryService empsalaryService;

    @PostMapping("/")
    public Result getsobcfg(@RequestBody EmployeeRequest employeeRequest){
        PageHelper.startPage(employeeRequest.getPageNo(),employeeRequest.getPageSize(),true);
        PageInfo<Employee> pageInfo = new PageInfo<Employee>(employeeService.selectByExample( new EmployeeExample()));
        employeeRequest.setData(pageInfo.getList().stream().map(this::getEmployee).collect(Collectors.toList()));
        employeeRequest.setTotal(pageInfo.getTotal());
        return Result.success(employeeRequest);
    }

    @GetMapping("/salaries")
    public Result getSalaries(){
      return Result.success(salaryService.selectByExample(new SalaryExample()));
    }

    @PutMapping("/")
    public Result getInsertUpdate(int eid,int sid){
        return Result.success(empsalaryService.intInsertUpdate(eid,sid));

    }

    private EmployeeRequest getEmployee(Employee employee){
        EmployeeRequest employeeRequest = new  EmployeeRequest();
        BeanUtils.copyProperties(employee,employeeRequest);
        employeeRequest.setDepartment(departmentService.selectByPrimaryKey(employeeRequest.getDepartmentId()));
        employeeRequest.setSalary(salaryService.selectByPrimaryKey(empsalaryService.findSIDByEID(employeeRequest.getId())));
        return employeeRequest;
    }
}
