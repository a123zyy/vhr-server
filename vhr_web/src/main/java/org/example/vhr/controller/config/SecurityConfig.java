package org.example.vhr.controller.config;

import org.example.vhr.HrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;
import org.springframework.security.core.session.SessionRegistryImpl;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.authentication.session.ConcurrentSessionControlAuthenticationStrategy;

@EnableWebSecurity
@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    /**
     * 用户密码校验过滤器
     */

    private AdminAuthenticationProcessingFilter adminAuthenticationProcessingFilter;

//    public SecurityConfig(AdminAuthenticationProcessingFilter adminAuthenticationProcessingFilter) {
//        this.adminAuthenticationProcessingFilter = adminAuthenticationProcessingFilter;
//    }
    LoginFilter loginFilter() throws Exception {
        LoginFilter loginFilter = new LoginFilter();
        loginFilter.setAuthenticationManager(authenticationManagerBean());
        loginFilter.setFilterProcessesUrl("/doLogin");
        ConcurrentSessionControlAuthenticationStrategy sessionStrategy = new ConcurrentSessionControlAuthenticationStrategy(sessionRegistry());
        sessionStrategy.setMaximumSessions(1);
        loginFilter.setSessionAuthenticationStrategy(sessionStrategy);
        return loginFilter;
    }

    SessionRegistryImpl sessionRegistry() {
        return new SessionRegistryImpl();
    }



    //对authorizeRequests()的调⽤会返回⼀个对象 （ExpressionInterceptUrlRegistry），
    // 基于它我们可以指定URL路 径和这些路径的安全需求。
    @Override
    protected void configure(HttpSecurity http)throws Exception{

       // ExpressionUrlAuthorizationConfigurer<HttpSecurity>.ExpressionInterceptUrlRegistry registry = http.antMatcher("/**").authorizeRequests();

        http.csrf().disable().cors();
        //允许匿名url
        //registry.antMatchers("/doLogin","/verifyCode").permitAll();
        // OPTIONS(选项)：查找适用于一个特定网址资源的通讯选择。 在不需执行具体的涉及数据传输的动作情况下， 允许客户端来确定与资源相关的选项以及 / 或者要求， 或是一个服务器的性能
        //registry.antMatchers(HttpMethod.OPTIONS,"/**").denyAll();
        // 其余所有请求都需要认证
       // registry.anyRequest().authenticated();
        // 防止iframe 造成跨域
        //registry.and().headers().frameOptions().disable();
        // 自定义过滤器认证用户名密码
//       http.addFilterAt( UsernamePasswordAuthenticationFilter.class);

    }



    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }




}
