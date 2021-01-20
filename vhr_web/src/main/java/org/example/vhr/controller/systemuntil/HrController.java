package org.example.vhr.controller.systemuntil;

import org.example.vhr.Hr;
import org.example.vhr.HrExample;
import org.example.vhr.HrService;
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
@RequestMapping("/system/hr")
@RestController
@CrossOrigin(origins = "*")
public class HrController {

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private HrService hrService;


    @GetMapping("/")
    public Result getHrsbyid(HttpServletRequest request, String keywords){
        Integer hrid = jwtTokenUtil.getUseridFromToken(request.getHeader("token"));
        if(hrid.equals("")){
            return Result.error(ResultMsg.LOGIN_TIMEOUT);
        }
       return Result.success( hrService.selectByPrimaryKey(hrid));
    }
}
