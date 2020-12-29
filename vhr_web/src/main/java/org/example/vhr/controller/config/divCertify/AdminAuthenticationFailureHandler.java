package org.example.vhr.controller.config.divCertify;

import lombok.extern.slf4j.Slf4j;
import org.example.vhr.controller.until.Result;
import org.example.vhr.controller.until.ResultMsg;
import org.springframework.security.authentication.*;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Slf4j
@Component
public class AdminAuthenticationFailureHandler implements AuthenticationFailureHandler {

    @Override
    public void onAuthenticationFailure(HttpServletRequest httpServletRequest, HttpServletResponse response, AuthenticationException e) throws IOException, ServletException {
        if (e instanceof UsernameNotFoundException || e instanceof BadCredentialsException) {
            Result.error(new ResultMsg(1009,e.getMessage()));
        } else if (e instanceof LockedException) {
            Result.error(new ResultMsg(1009,"账户被锁定，请联系管理员!"));
        } else if (e instanceof CredentialsExpiredException) {
            Result.error(new ResultMsg(1009,"证书过期，请联系管理员!"));
        } else if (e instanceof AccountExpiredException) {
            Result.error(new ResultMsg(1009,"账户过期，请联系管理员!"));
        } else if (e instanceof DisabledException) {
            Result.error(new ResultMsg(1009,"账户被禁用，请联系管理员!"));
        } else {
            log.error("登录失败：", e);
            Result.error(new ResultMsg(1009,"登录失败!"));
        }
        Result.success(response);
    }

}
