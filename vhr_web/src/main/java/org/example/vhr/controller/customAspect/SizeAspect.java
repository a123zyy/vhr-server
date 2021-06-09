package org.example.vhr.controller.customAspect;

import com.alibaba.fastjson.JSONArray;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.example.vhr.RewardAndPunishment;
import org.example.vhr.controller.ControllerRequest.RewardAndPunishmentRequest;
import org.example.vhr.controller.customConfig.SizeJudge;
import org.springframework.stereotype.Component;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @author zyy
 */
@Aspect
@Component
public class SizeAspect {

    //@Pointcut("@annotation(org.example.vhr.controller.customConfig.SizeJudge)")
    public void isSize(){
    }




   // @Around("isSize()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
           Object result = point.proceed();
        return result;
    }


}
