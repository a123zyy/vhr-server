package org.example.vhr.controller.webcontroller;

import org.example.vhr.Hr;
import org.example.vhr.HrService;
import org.example.vhr.controller.until.JwtTokenUtil;
import org.example.vhr.controller.until.Result;
import org.example.vhr.controller.until.ResultMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/hr")
@CrossOrigin(origins = "*")
public class HrInfoController {

    @Autowired
    private HrService hrService;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @GetMapping("/info")
    public Result getHrInfo(HttpServletRequest request){
        StringBuffer stringBuffer =new StringBuffer();
        Integer hrid = jwtTokenUtil.getUseridFromToken(request.getHeader("token"));
        if(hrid.equals("")){
            return Result.error(ResultMsg.LOGIN_TIMEOUT);
        }
       return Result.success(hrService.selectByPrimaryKey(hrid));
    }




    @PutMapping("/info")
    public Result updateHrInfo(@RequestBody Hr hr){
        return Result.success(hrService.updateByPrimaryKeySelective(hr));
    }

}
