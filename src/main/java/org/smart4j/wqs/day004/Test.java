package org.smart4j.wqs.day004;

import java.lang.reflect.Field;

/**
 * Test
 *
 * @Title: Test.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-6-14 17:29
 * @Author 90
 */
public class Test {

    public static void main(String[] args) {
        try {
            Class clazz=Class.forName("org.smart4j.wqs.day004.User");
            try {
                User user= (User) clazz.newInstance();
                user.setId(1);
                Field[] fields=clazz.getDeclaredFields();
                for (Field field:fields){
                    //成员变量为private ,因此要设置此参数
                    System.out.println(field.getName()+" type:"+field.getType());
                    field.setAccessible(true);

                    if(field.getType().toString().equals("int")){
                        System.out.println(field.getName());
                        field.set(user,3311);
                    }
                }
                System.out.println(user.toString());
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
