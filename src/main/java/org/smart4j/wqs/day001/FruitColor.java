package org.smart4j.wqs.day001;

import java.lang.annotation.*;

/**
 * FruitColor
 *
 * @Title: FruitColor.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-6-12 17:38
 * @Author 90
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface FruitColor {

    public enum Color{BLUE,RED,GREEN};

    Color fruitColor() default Color.GREEN;
}
