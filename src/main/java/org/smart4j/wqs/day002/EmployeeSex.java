package org.smart4j.wqs.day002;

/**
 * EmployeeSex
 *
 * @Title: EmployeeSex.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-6-12 18:21
 * @Author 90
 */
public @interface EmployeeSex {
    enum  Sex{MAN,WOMAN}
    Sex employeeSex() default Sex.MAN;


}
