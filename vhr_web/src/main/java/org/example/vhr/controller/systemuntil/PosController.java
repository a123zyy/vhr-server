package org.example.vhr.controller.SystemUntil;

import org.example.vhr.Position;
import org.example.vhr.PositionExample;
import org.example.vhr.PositionService;
import org.example.vhr.controller.until.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/system/basic/pos")
@RestController
@CrossOrigin(origins = "*")
public class PosController {

    @Autowired
    private PositionService positionService;

    @GetMapping("/")
    public Result getPositions(){
        return Result.success(positionService.selectByExample(new PositionExample()));
    }
    @PostMapping("/")
    public Result getPositions(@RequestBody Position position){
        return Result.success(positionService.insertSelective(position));
    }
    @PutMapping("/")
    public Result UpdatePositions(@RequestBody Position position){
        return Result.success(positionService.updateByPrimaryKeySelective(position));
    }
    @DeleteMapping("/{id}")
    public Result UpdatePositions(@PathVariable int id){
        return Result.success(positionService.deleteByPrimaryKey(id));
    }
    @DeleteMapping("/ids/{ids}")
    public Result deletePos(@PathVariable Integer[] ids){
        return Result.success(positionService.deleteByIds(ids));
    }
}
