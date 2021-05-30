package org.example.vhr.controller.customConfig;

import java.lang.annotation.*;

/**
 * @author zyy
 * ElementType枚举常量的含义：
 * ANNOTATION_TYPE  注解类型声明
 * CONSTRUCTOR         构造方法声明
 * FIELD                          属性、字段声明（包括枚举常量）
 * LOCAL_VARIABLE       局部变量声明
 * METHOD                     方法声明
 * PACKAGE                    包声明
 * PARAMETER               参数声明
 * TYPE                            类、接口（包括注解类型）、枚举声明、用户自定义的注解
 * TYPE_PARAMETER      @since 1.8
 * TYPE_USE                    @since 1.8
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.METHOD})
@Inherited
public @interface SizeJudge {
    String message();
}
