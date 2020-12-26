package org.example.vhr.controller;

import org.example.vhr.Department;
import org.example.vhr.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class testController {
    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/test")
    public String getparamer(){
        return  departmentService.findAll();
    }
}
