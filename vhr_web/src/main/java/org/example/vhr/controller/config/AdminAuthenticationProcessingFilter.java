package org.example.vhr.controller.config;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.vhr.Hr;
import org.example.vhr.controller.config.Filter.CusAuthenticationManager;
import org.example.vhr.controller.config.divCertify.AdminAuthenticationFailureHandler;
import org.example.vhr.controller.config.divCertify.AdminAuthenticationSuccessHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.security.web.util.matcher.RequestMatcher;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//自定义密码校验过滤器
@Slf4j
@Component
public class AdminAuthenticationProcessingFilter extends AbstractAuthenticationProcessingFilter {

    /**
     * @param authenticationManager:             认证管理器
     * @param adminAuthenticationSuccessHandler: 认证成功处理
     * @param adminAuthenticationFailureHandler: 认证失败处理
     */
    public AdminAuthenticationProcessingFilter(CusAuthenticationManager authenticationManager, AdminAuthenticationSuccessHandler adminAuthenticationSuccessHandler, AdminAuthenticationFailureHandler adminAuthenticationFailureHandler) {
        super(new AntPathRequestMatcher("/login", "POST"));
        this.setAuthenticationManager(authenticationManager);
        this.setAuthenticationSuccessHandler(adminAuthenticationSuccessHandler);
        this.setAuthenticationFailureHandler(adminAuthenticationFailureHandler);
    }

    protected AdminAuthenticationProcessingFilter(String defaultFilterProcessesUrl) {
        super(defaultFilterProcessesUrl);
    }

    protected AdminAuthenticationProcessingFilter(RequestMatcher requiresAuthenticationRequestMatcher) {
        super(requiresAuthenticationRequestMatcher);
    }

    protected AdminAuthenticationProcessingFilter(String defaultFilterProcessesUrl, AuthenticationManager authenticationManager) {
        super(defaultFilterProcessesUrl, authenticationManager);
    }

    protected AdminAuthenticationProcessingFilter(RequestMatcher requiresAuthenticationRequestMatcher, AuthenticationManager authenticationManager) {
        super(requiresAuthenticationRequestMatcher, authenticationManager);
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException, IOException, ServletException {
        if (request.getContentType() == null) {
            throw new AuthenticationServiceException("请求头类型不支持: " + request.getContentType());
        }

        UsernamePasswordAuthenticationToken authRequest;
        try {
            System.out.println(request);
            String username = request.getHeader("username");
            String password = request.getHeader("username");
           authRequest = new UsernamePasswordAuthenticationToken(username, password, null);
           Hr hr = new Hr();
            authRequest.setDetails(authenticationDetailsSource.buildDetails(request));
        } catch (Exception e) {
            throw new AuthenticationServiceException(e.getMessage());
        }
        return this.getAuthenticationManager().authenticate(authRequest);
    }
}
