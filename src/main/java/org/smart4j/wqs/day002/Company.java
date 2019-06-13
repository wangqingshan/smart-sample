package org.smart4j.wqs.day002;

import org.smart4j.wqs.day001.FruitColor;

import java.lang.annotation.*;

/**
 * Company
 *
 * @Title: Company.java
 * @Copyright: Copyright (c) 2005
 * @Description: （运行时注解）https://www.jianshu.com/p/7a910df85f61
 * @Company: 互动百科
 * @Created on 2019-6-12 17:59
 * @Author 90
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Company {

    public int id() default -1;
    public String name() default "";
    public String address() default "";


}
