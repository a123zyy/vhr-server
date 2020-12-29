package org.example.vhr.controller.config.divCertify;

import lombok.extern.slf4j.Slf4j;
import org.example.vhr.Hr;
import org.example.vhr.Security.SecurityUser;
import org.example.vhr.controller.until.Result;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
@Slf4j
public class AdminAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

    //自定义登录验证
    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse response, Authentication auth) throws IOException, ServletException {
        Hr hr =new Hr();
        SecurityUser securityUser = ((SecurityUser) auth.getPrincipal());
        log.info(securityUser.getUsername()+"自定义登录验证通过");
        Result.success(hr); }

}
