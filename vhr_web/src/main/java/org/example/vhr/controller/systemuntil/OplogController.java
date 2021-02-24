package org.example.vhr.controller.systemuntil;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.example.vhr.Employee;
import org.example.vhr.Oplog;
import org.example.vhr.OplogExample;
import org.example.vhr.OplogService;
import org.example.vhr.controller.until.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author zyy
 */
@RequestMapping("/system/basic/oplog")
@RestController
@CrossOrigin(origins = "*")
public class OplogController {

    @Autowired
    public OplogService oplogService;


    @GetMapping("/")
    @Cacheable(value = "getOplog", key = "'get_oplog'+#pageNo+#pageSize")
    public Result getOplog(int pageNo,int pageSize){
        PageHelper.startPage(pageNo,pageSize,true);
        PageInfo<Oplog> pageInfo = new PageInfo<Oplog>(oplogService.selectByExample(new OplogExample()));
        Map<String,Object> map = new HashMap<>();
        map.put("list",pageInfo.getList());
        map.put("total",pageInfo.getTotal());
        return  Result.success(map);
    }
}
