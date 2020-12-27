package org.example.vhr.controller.config;

import org.example.vhr.HrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    HrService hrService;

    //对authorizeRequests()的调⽤会返回⼀个对象 （ExpressionInterceptUrlRegistry），
    // 基于它我们可以指定URL路 径和这些路径的安全需求。
    protected  void  configure(HttpSecurity http)throws Exception{
        http
                .authorizeRequests()
                .antMatchers("/design").access("hasRole('')")
                .antMatchers("/","/**").permitAll()
                .and().csrf().disable().logout().logoutSuccessUrl("/");
//                .and().formLogin().loginPage("/doLogin");


    }

    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }




}
