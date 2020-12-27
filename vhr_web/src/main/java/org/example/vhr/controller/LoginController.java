package org.example.vhr.controller;

import org.example.vhr.controller.until.Result;
import org.example.vhr.controller.until.VerificationCode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;

@RestController
public class LoginController {

    @GetMapping("/dologin")
     public Result doLogin(String code,String username,String password){
         return Result.success("请求成果");
     }
     @GetMapping("/verifyCode")
     public void VerifyCode(HttpServletRequest request, HttpServletResponse resp) throws IOException {
         VerificationCode verificationCode = new VerificationCode();
         BufferedImage image = verificationCode.getImage();
         String text = verificationCode.getText();
         HttpSession session = request.getSession(true);
         session.setAttribute("verify_code",text);
         verificationCode.output(image,resp.getOutputStream());
    }




}
