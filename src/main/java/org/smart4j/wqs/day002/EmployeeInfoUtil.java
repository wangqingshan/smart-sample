package org.smart4j.wqs.day002;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * EmployeeInfoUtil
 *
 * @Title: EmployeeInfoUtil.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-6-13 9:35
 * @Author 90
 */
public class EmployeeInfoUtil {

    /**
     * 获取注解的信息
     * @param clazz
     * @return
     */
    public static Map getEmployeeInfo(Class<?> clazz){

        HashMap<String,String> info =new HashMap<String,String>();
        Field[] fields=clazz.getDeclaredFields();
        for(Field field:fields){

            if(field.isAnnotationPresent(EmployeeName.class)){
                //判断是否是EmployeeName注解
                EmployeeName employeeName=field.getAnnotation(EmployeeName.class);
                info.put("employeeName",employeeName.value());
            }
            if(field.isAnnotationPresent(Company.class)){
                //判断是否是EmployeeName注解
                Company company=field.getAnnotation(Company.class);
                info.put("company","地址："+company.address()+" 公司名："+company.name()+" 门牌号："+company.id());
            }

        }

        if(clazz.isAnnotationPresent(ClassType.class)){
            ClassType ctype=clazz.getAnnotation(ClassType.class);
            info.put("classType",ctype.value().toString());
        }

        //Field[] fieldsType=clazz.
        return info;
    }

    public static void main(String[] args) {
        Map<String,String> info=EmployeeInfoUtil.getEmployeeInfo(EmployeeInfo.class);
        System.out.println(info.toString());
    }
}
