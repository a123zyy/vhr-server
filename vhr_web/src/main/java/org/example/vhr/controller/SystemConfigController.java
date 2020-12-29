package org.example.vhr.controller;

import org.example.vhr.Hr;
import org.example.vhr.HrRoleService;
import org.example.vhr.MenuRoleMapper;
import org.example.vhr.RoleService;
import org.example.vhr.controller.until.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/system/config")
@RestController
@CrossOrigin(origins = "*")
public class SystemConfigController {
    @Autowired
    public HrRoleService hrRoleService;
    @Autowired
    public MenuRoleMapper menuRoleMapper;
    @Autowired
    public RoleService roleService;


    @GetMapping("/menu")
    public Result getRoleMenu(){
        String hr= (String) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        return Result.success(hr);


    }


}
