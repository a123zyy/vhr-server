package org.example.vhr.controller;

import org.example.vhr.Department;
import org.example.vhr.DepartmentService;
import org.example.vhr.Joblevel;
import org.example.vhr.JoblevelExample;
import org.example.vhr.JoblevelService;
import org.example.vhr.Position;
import org.example.vhr.PositionExample;
import org.example.vhr.PositionService;
import org.example.vhr.controller.until.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/system/basic")
@RestController
@CrossOrigin(origins = "*")
public class PermissController {

    @Autowired
    private DepartmentService departmentService;

    @Autowired
    private JoblevelService joblevelService;

    @Autowired
    private PositionService positionService;
    //获取职位树
    @GetMapping("/department")
    public Result getDepartment(){
        return Result.success(departmentService.findAllByParendId());
    }
    @PostMapping("/department")
    public Result addDepartment(@RequestBody Department department){
        departmentService.addDep(department);
        return Result.success(department);
    }
    @DeleteMapping("/department/{id}")
    public Result departmentByID(@PathVariable int id){
        return Result.success(departmentService.deleteByPrimaryKey(id));
    }
    @GetMapping("/joblevel")
    public Result getJoblevel(){
        return Result.success(joblevelService.selectByExample(new JoblevelExample()));
    }
    @PutMapping("/joblevel")
    public Result updateJoblevel(@RequestBody Joblevel joblevel){
        return Result.success(joblevelService.updateByPrimaryKeySelective(joblevel));
    }
    @PostMapping("/joblevel")
    public Result insertoblevel(@RequestBody Joblevel joblevel){
        return Result.success(joblevelService.insertSelective(joblevel));
    }
    @DeleteMapping("/joblevel/{id}")
    public Result deleteJoblevel(@PathVariable int id){
        return Result.success(joblevelService.deleteByPrimaryKey(id));
    }
    @GetMapping("/joblevel/{ids}")
    public Result deleteJoblevel(@PathVariable @RequestBody Integer[] ids){
        return Result.success(joblevelService.deleteByIds(ids));
    }
    @GetMapping("/pos")
    public Result getPositions(){
        return Result.success(positionService.selectByExample(new PositionExample()));
    }
    @PostMapping("/pos")
    public Result getPositions(@RequestBody Position position){
        return Result.success(positionService.insertSelective(position));
    }
    @PutMapping("/pos")
    public Result UpdatePositions(@RequestBody Position position){
        return Result.success(positionService.updateByPrimaryKeySelective(position));
    }
    @DeleteMapping("/pos/{id}")
    public Result UpdatePositions(@PathVariable int id){
        return Result.success(positionService.deleteByPrimaryKey(id));
    }
    @DeleteMapping("/pos/ids")
    public Result deletePos(@RequestBody List<Integer> ids){
        return Result.success(positionService.deleteByIds(ids));
    }


}
