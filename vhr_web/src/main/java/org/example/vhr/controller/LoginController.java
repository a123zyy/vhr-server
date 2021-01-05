package org.example.vhr.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.vhr.Hr;
import org.example.vhr.HrService;
import org.example.vhr.RoleService;
import org.example.vhr.controller.ControllerRequest.HrRequest;
import org.example.vhr.controller.until.JwtTokenUtil;
import org.example.vhr.controller.until.Result;
import org.example.vhr.controller.until.ResultMsg;
import org.example.vhr.controller.until.VerificationCode;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.Console;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
public class LoginController {

    @Autowired
    public PasswordEncoder passwordEncoder;

    @Autowired
    public HrService hrService;
    @Autowired
    public RoleService roleService;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;

//    @Autowired
//    SessionRegistry sessionRegistry;

    @GetMapping("/test")
    public String getTest() {
        return "success";
    }


    @GetMapping("/doLogin")
     public Result doLogin(String code,String username,String password){
        //验证code
        Hr hr = hrService.findByUserName(username);
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        if (encoder.matches(password,hr.getPassword())){
            HrRequest hrRequest = new HrRequest();
            BeanUtils.copyProperties(hr,hrRequest);
            hrRequest.setRoles(roleService.findbyLikeRoleName(hrRequest.getUsername()));
//            sessionRegistry.registerNewSession(hr.getId()+"",hrRequest);
            //查权限
            hrRequest.setToken(jwtTokenUtil.generateToken(hr));
            return Result.success(hrRequest);
        }
        return Result.error(ResultMsg.equipment_occupy);



     }
     @GetMapping("/verifyCode")
     public void VerifyCode(HttpServletRequest request, HttpServletResponse resp) throws IOException {
         VerificationCode verificationCode = new VerificationCode();
         BufferedImage image = verificationCode.getImage();
         String text = verificationCode.getText();
         HttpSession session = request.getSession(true);
         session.setAttribute("verify_code",text);
         VerificationCode.output(image,resp.getOutputStream());
    }

}
