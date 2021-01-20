package org.example.vhr.controller.systemuntil;

import org.example.vhr.*;
import org.example.vhr.controller.until.JwtTokenUtil;
import org.example.vhr.controller.until.Result;
import org.example.vhr.controller.until.ResultMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author zyy
 */
@RequestMapping("/system/hr")
@RestController
@CrossOrigin(origins = "*")
public class HrController {

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private HrService hrService;
    @Autowired
    private RoleService roleService;
    @Autowired
    private HrRoleService hrRoleService;


    @GetMapping("/")
    public Result getHrsbyid(HttpServletRequest request, String keywords){
        Integer hrid = jwtTokenUtil.getUseridFromToken(request.getHeader("token"));
        if(hrid.equals("")){
            return Result.error(ResultMsg.LOGIN_TIMEOUT);
        }
       return Result.success(hrService.selectByExample(new HrExample()).stream().map((item)->{
           item.setRoles(roleService.findByHrid(item.getId()));
           return item;
       }).filter(x -> x.getId() != hrid).collect(Collectors.toList()));
    }

    @GetMapping("/roles")
    public Result getRoles(){
        return Result.success(roleService.selectByExample(new RoleExample()));
    }

    @PutMapping("/role")
    public Result addmenuRole(@RequestParam(value = "hrid")int hrid,@RequestParam(value = "rids") List<Integer> rids){
        HrRoleExample hrRoleExample = new HrRoleExample();
        hrRoleExample.or().andHridEqualTo(hrid);
        hrRoleService.deleteByExample(hrRoleExample);
        return Result.success(hrRoleService.insertByHridAndRid(hrid,rids));
    }
}
