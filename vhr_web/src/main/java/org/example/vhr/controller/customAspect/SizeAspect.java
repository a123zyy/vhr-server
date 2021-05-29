package org.example.vhr.controller.customAspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.example.vhr.controller.customConfig.SizeJudge;
import org.example.vhr.controller.log.LogAspect;
import org.springframework.stereotype.Component;

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



    @Around("isSize()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        long beginTime = System.currentTimeMillis();
        //执行方法
        System.out.println("切面11111111");
        Object result = point.proceed();
        //执行时长(毫秒)
        long time = System.currentTimeMillis() - beginTime;
        System.out.println("切面11111111");
        System.out.println(point.proceed());
        return result;
    }

    public static <T> boolean doValidator(T clas){
        Class<?> clazz = clas.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            SizeJudge checkNull = field.getDeclaredAnnotation(SizeJudge.class);
            if (null!=checkNull) {
                Object value = getValue(clas, field.getName());
                if (!notNull(value)) {
                    throwExcpetion(checkNull.message());
                }
            }
        }
        return true;
    }
    /**
     * 获取当前fieldName对应的值
     *
     * @param clas		对应的bean对象
     * @param fieldName	bean中对应的属性名称
     * @return
     */
    public static <T> Object getValue(T clas,String fieldName){
        Object value = null;
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(clas.getClass());
            PropertyDescriptor[] props = beanInfo.getPropertyDescriptors();
            for (PropertyDescriptor property : props) {
                if (fieldName.equals(property.getName())) {
                    Method method = property.getReadMethod();
                    value = method.invoke(clas, new Object[]{});
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return value;
    }

    /**
     * 非空校验
     *
     * @param value
     * @return
     */
    public static boolean notNull(Object value){
        if(null==value){
            return false;
        }
        if(value instanceof String && isEmpty((String)value)){
            return false;
        }
        if(value instanceof List && isEmpty((List<?>)value)){
            return false;
        }
        return null!=value;
    }

    public static boolean isEmpty(String str){
        return null==str || str.isEmpty();
    }
    public static boolean isEmpty(List<?> list){
        return null==list || list.isEmpty();
    }

    private static void throwExcpetion(String msg) {
        if(null!=msg){
            throw new Error(msg);
        }
    }


}
