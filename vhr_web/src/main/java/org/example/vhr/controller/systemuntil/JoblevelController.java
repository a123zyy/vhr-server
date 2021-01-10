package org.example.vhr.controller.SystemUntil;

import org.example.vhr.Joblevel;
import org.example.vhr.JoblevelExample;
import org.example.vhr.JoblevelService;
import org.example.vhr.controller.until.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/system/basic/joblevel")
@RestController
@CrossOrigin(origins = "*")
public class JoblevelController {
    @Autowired
    private JoblevelService joblevelService;

    @GetMapping("/")
    public Result getJoblevel(){
        return Result.success(joblevelService.selectByExample(new JoblevelExample()));
    }
    @PutMapping("/")
    public Result updateJoblevel(@RequestBody Joblevel joblevel){
        return Result.success(joblevelService.updateByPrimaryKeySelective(joblevel));
    }
    @PostMapping("/")
    public Result insertoblevel(@RequestBody Joblevel joblevel){
        return Result.success(joblevelService.insertSelective(joblevel));
    }
    @DeleteMapping("/{id}")
    public Result deleteJoblevel(@PathVariable int id){
        return Result.success(joblevelService.deleteByPrimaryKey(id));
    }
    @GetMapping("/{ids}")
    public Result deleteJoblevel(@PathVariable @RequestBody Integer[] ids){
        return Result.success(joblevelService.deleteByIds(ids));
    }
}
