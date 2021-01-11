package org.example.vhr.controller.systemuntil;

import org.example.vhr.Department;
import org.example.vhr.DepartmentService;
import org.example.vhr.controller.until.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/system/basic/department")
@RestController
@CrossOrigin(origins = "*")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    //获取职位树
    @GetMapping("/")
    public Result getDepartment(){
        return Result.success(departmentService.findAllByParendId());
    }
    @PostMapping("/")
    public Result addDepartment(@RequestBody Department department){
        departmentService.addDep(department);
        return Result.success(department);
    }
    @DeleteMapping("/{id}")
    public Result departmentByID(@PathVariable int id){
        return Result.success(departmentService.deleteByPrimaryKey(id));
    }
}
