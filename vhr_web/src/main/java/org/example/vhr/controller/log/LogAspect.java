package org.example.vhr.controller.log;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.example.vhr.Oplog;
import org.example.vhr.OplogService;
import org.example.vhr.controller.until.JwtTokenUtil;
import org.example.vhr.controller.until.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.logging.Logger;

@Aspect
@Component
@Slf4j
/**
 * @author zyy
 * 生成日志
 */
public class LogAspect {

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private OplogService oplogService;

    @Pointcut("execution(public * org.example.vhr.controller.webcontroller..*.*(..))")//切入点描述 这个是webcontroller包的切入点
    public void controllerMethod(){} //签名，可以理解成这个切入点的一个名称


    @Pointcut("execution(public * org.example.vhr.controller.systemuntil..*.*(..))")//切入点描述 这个是systemuntil包的切入点
    public void systemController(){} //签名，可以理解成这个切入点的一个名称


    @Before("controllerMethod() || systemController()")
    public void LogRequestInfo(JoinPoint joinPoint) throws Exception{
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        //拿到头信息
        HttpServletRequest request = requestAttributes.getRequest();
        Oplog oplog = new Oplog();
        oplog.setAdddate(new Date());
        String token =  request.getHeader("token");
        oplog.setHrid(jwtTokenUtil.getUseridFromToken(token));
        oplog.setOperate(jwtTokenUtil.getNameFromToken(token)+"操作了"+request.getRequestURI());
        oplogService.insertSelective(oplog);
        //        System.out.println("----切面里joinPoint是getKind"+joinPoint.getKind());
//        System.out.println("----切面里joinPoint是toLongString"+joinPoint.toLongString());
//        System.out.println("----切面里joinPoint是toShortString"+joinPoint.toShortString());
//        System.out.println("----切面里joinPoint是toString"+joinPoint.toString());
//        System.out.println("----切面里joinPoint是getArgs"+joinPoint.getArgs());
        //下面这个getSignature().getDeclaringTypeName()是获取包+类名的   然后后面的joinPoint.getSignature.getName()获取了方法名
       // System.out.println("----切面里joinPoint是getSignature-----"+joinPoint.getSignature().getName());
//        System.out.println("----切面里joinPoint是getSourceLocation"+joinPoint.getSourceLocation());
//        System.out.println("----切面里joinPoint是getStaticPart"+joinPoint.getStaticPart());
//        System.out.println("----切面里joinPoint是getTarget"+joinPoint.getTarget());
//        System.out.println("----切面里joinPoint是getThis"+joinPoint.getThis());
    }

//    @AfterReturning(returning = "result")
//    @Pointcut("controllerMethod()")
//    public void logResultVOInfo(Result result) throws Exception {
//        log.info("请求结果：" + result.getStatus() + "\t" + result.getMsg());
//    }


}
