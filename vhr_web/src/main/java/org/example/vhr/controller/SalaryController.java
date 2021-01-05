package org.example.vhr.controller;

import org.example.vhr.Salary;
import org.example.vhr.SalaryExample;
import org.example.vhr.SalaryService;
import org.example.vhr.controller.until.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/salary/sob")
public class SalaryController {
    @Autowired
    private SalaryService salaryService;

    @GetMapping("/")
    public Result getAllSalary(){
        return Result.success(salaryService.selectByExample(new SalaryExample()));
    }
    @PatchMapping("/")
    public Result addSalary(@RequestBody Salary salary){
        return Result.success(salaryService.insert(salary));
    }
    @PutMapping("/")
    public Result updateSalary(@RequestBody Salary salary){
        return Result.success(salaryService.updateByPrimaryKey(salary));
    }
    @DeleteMapping("/{id}")
    public Result updateSalary(@PathVariable int id){
        return Result.success(salaryService.deleteByPrimaryKey(id));
    }
}
