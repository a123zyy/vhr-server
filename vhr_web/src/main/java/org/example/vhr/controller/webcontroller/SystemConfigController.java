package org.example.vhr.controller.webcontroller;

import org.example.vhr.HrRoleService;
import org.example.vhr.MenuService;
import org.example.vhr.RoleService;
import org.example.vhr.controller.until.JwtTokenUtil;
import org.example.vhr.controller.until.Result;
import org.example.vhr.controller.until.ResultMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author zyy
 */
@RequestMapping("/system/config")
@RestController
@CrossOrigin(origins = "*")
public class SystemConfigController {
    @Autowired
    public HrRoleService hrRoleService;
    @Autowired
    public RoleService roleService;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Autowired
    private MenuService menuService;


    /**
     * 根据id拿到该用户的权限
     * @param request
     * @return
     */
    @GetMapping("/menu")
    public Result getRoleMenu(HttpServletRequest request){
        Integer hrid = jwtTokenUtil.getUseridFromToken(request.getHeader("token"));
       if(hrid.equals("")){
           return Result.error(ResultMsg.LOGIN_TIMEOUT);
       }
       return Result.success(menuService.findIdsByMenus(hrid));
    }



}
