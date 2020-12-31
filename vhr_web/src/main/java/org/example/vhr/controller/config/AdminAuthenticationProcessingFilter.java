package org.example.vhr.controller.config;

import lombok.extern.slf4j.Slf4j;
import org.example.vhr.Hr;
import org.example.vhr.controller.ControllerRequest.HrRequest;
import org.example.vhr.controller.config.Filter.CusAuthenticationManager;
import org.example.vhr.controller.config.divCertify.AdminAuthenticationFailureHandler;
import org.example.vhr.controller.config.divCertify.AdminAuthenticationSuccessHandler;
import lombok.extern.slf4j.Slf4j;
import org.example.vhr.controller.until.Result;
import org.springframework.beans.BeanUtils;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author zyy
 */ //自定义密码校验过滤器
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

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
        if (request.getContentType() == null) {
            throw new AuthenticationServiceException("请求头类型不支持: " + request.getContentType());
        }
        try {
            System.out.println(request);
//            BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
//            if (encoder.matches(password,hr.getPassword())){
//                HrRequest hrRequest = new HrRequest();
//                BeanUtils.copyProperties(hr,hrRequest);
//                hrRequest.setRoles(roleService.findbyLikeRoleName(hrRequest.getUsername()));
//                sessionRegistry.registerNewSession(hr.getId()+"",hrRequest);
//                //查权限
//                return Result.success(hrRequest);
//
//            }
//            MultiReadHttpServletRequest wrappedRequest = new MultiReadHttpServletRequest(request);
//            // 将前端传递的数据转换成jsonBean数据格式
//            User user = JSONObject.parseObject(wrappedRequest.getBodyJsonStrByJson(wrappedRequest), User.class);
//            authRequest = new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword(), null);
//            authRequest.setDetails(authenticationDetailsSource.buildDetails(wrappedRequest));
        } catch (Exception e) {
            throw new AuthenticationServiceException(e.getMessage());
        }
        return this.getAuthenticationManager().authenticate((Authentication) response);
    }

}
