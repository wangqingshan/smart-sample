package org.smart4j.wqs.day002;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ClassType
 *
 * @Title: ClassType.java
 * @Copyright: Copyright (c) 2005
 * @Description: 标识类类型
 * @Company: 互动百科
 * @Created on 2019-6-13 16:16
 * @Author 90
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ClassType {
    enum ctype{SERVICE,ACTION,MODEL}
    ctype value() default ctype.ACTION;
}
