package org.example.vhr.controller.SystemUntil;

import org.example.vhr.*;
import org.example.vhr.controller.until.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RequestMapping("/system/basic/permiss")
@RestController
@CrossOrigin(origins = "*")
public class PermissController {

    @Autowired
    private RoleService roleService;

    @Autowired
    private MenuService menuService;
    @Autowired
    private MenuRoleService menuRoleService;


    @GetMapping("/")
    public Result getPermiss(){
        return Result.success(roleService.selectByExample(new RoleExample()));
    }

    @PostMapping("/role")
    public Result addPermiss(@RequestBody Role role){
        return Result.success(roleService.insertSelective(role));
    }

    @GetMapping("/menus")
    public Result getMenus(){
        return Result.success(menuService.findAll());
    }


    @GetMapping("/mids/{id}")
    public Result getMidByrid(@PathVariable int id){
        MenuRoleExample menuRoleExample =new MenuRoleExample();
        menuRoleExample.or().andRidEqualTo(id);
        return Result.success(menuRoleService.selectByExample(menuRoleExample).stream().map(item-> item.getMid()).collect(Collectors.toList()));
    }
    @PutMapping("/")
    public Result addmenuRole(@RequestParam(value = "rid")int rid,@RequestParam(value = "mids") List<Integer> mids){
      menuRoleService.deleteByRid(rid);
      return Result.success(menuRoleService.insertByRidAndMids(rid,mids));
    }
    @DeleteMapping("/role/{id}")
    public Result deleteByRid(@PathVariable int id){
        menuRoleService.deleteByRid(id);
        return Result.success(roleService.deleteByPrimaryKey(id));
    }



}
