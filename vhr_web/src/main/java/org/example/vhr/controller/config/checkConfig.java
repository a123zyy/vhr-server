package org.example.vhr.controller.config;

import org.example.vhr.controller.customConfig.SizeJudge;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;

public class checkConfig {
    public static <T> boolean doValidator(T clas){
        Class<?> clazz = clas.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            SizeJudge checkNull = field.getDeclaredAnnotation(SizeJudge.class);
            if (null!=checkNull) {
                Object value = getValue(clas, field.getName());
                if (is_size(value) > 100) {
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

    /**
     * 长度校验
     *
     * @param obj
     * @return
     */
    public static int is_size(Object obj){
        if (notNull(obj)){
            if (obj instanceof CharSequence) {
                return ((CharSequence) obj).length();
            }
            if (obj instanceof Collection) {
                return ((Collection<?>) obj).size();
            }
            if (obj instanceof Map) {
                return ((Map<?, ?>) obj).size();
            }

            int count;
            if (obj instanceof Iterator) {
                Iterator<?> iter = (Iterator<?>) obj;
                count = 0;
                while (iter.hasNext()) {
                    count++;
                    iter.next();
                }
                return count;
            }
            if (obj instanceof Enumeration) {
                Enumeration<?> enumeration = (Enumeration<?>) obj;
                count = 0;
                while (enumeration.hasMoreElements()) {
                    count++;
                    enumeration.nextElement();
                }
                return count;
            }
            if (obj.getClass().isArray() == true) {
                return Array.getLength(obj);
            }
        }

        return 0;
    }
}
