package org.example.vhr.controller.config.divCertify;

import lombok.extern.slf4j.Slf4j;
import org.example.vhr.Hr;
import org.example.vhr.HrService;
import org.example.vhr.Security.SecurityUser;
import org.example.vhr.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class AdminAuthenticationProvider {

    private UserDetailsServiceImpl userDetailsService;

    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        // 获取前端表单中输入后返回的用户名、密码
        String userName = (String) authentication.getPrincipal();
        String password = (String) authentication.getCredentials();
        log.info(userName="++userName++",password="++password++");

        SecurityUser userInfo = (SecurityUser) userDetailsService.loadUserByUsername(userName);

        // 验证密码
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

        if (encoder.matches(password, userInfo.getPassword())) {
            throw new BadCredentialsException("密码错误！");
        }

        // 前后端分离情况下 处理逻辑...
        // 更新登录令牌 - 之后访问系统其它接口直接通过token认证用户权限...
        String token = encoder.encode(System.currentTimeMillis() +userInfo.getPassword());
        log.info(token="+token+++");
        return new UsernamePasswordAuthenticationToken(userInfo, password, userInfo.getAuthorities());
    }

    public boolean supports(Class<?> aClass) {
        return true;
    }
}
