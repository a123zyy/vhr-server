package org.example.vhr.controller.customAspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.example.vhr.controller.customConfig.SizeJudge;
import org.example.vhr.controller.log.LogAspect;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/**
 * @author zyy
 */
@Aspect
@Component
public class SizeAspect {

    @Pointcut("@annotation(org.example.vhr.controller.customConfig.SizeJudge)")
    public void isSize(){
    }


   //增强环绕方式
    @Around("isSize()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        return "";
    }




}
