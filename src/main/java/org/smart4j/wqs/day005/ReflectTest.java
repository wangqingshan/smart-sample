package org.smart4j.wqs.day005;
import java.lang.reflect.*;
/**
 * ReflectTest
 *
 * @Title: ReflectTest.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-6-19 14:20
 * @Author 90
 */
public class ReflectTest {


    public static void main(String[] args) throws Exception {

        Class<?> clazz=Class.forName("org.smart4j.wqs.day005.A");
        Object obj=clazz.newInstance();



        //返回A的构造方法
        Constructor c=clazz.getConstructor();
        System.out.println(c);

        //返回所有的public的构造方法
        Constructor[] publicCons=clazz.getConstructors();
        for (Constructor con:publicCons){
            System.out.println("只是public:"+con);
        }
        //返回所有的方法，包括private
        Constructor[] allCons=clazz.getDeclaredConstructors();
        for (Constructor con:allCons){
            System.out.println("全部:"+con);
        }
        Method say=clazz.getMethod("say");
        say.invoke(obj,null);
        ///或者say.invoke(obj);

        Method word=clazz.getMethod("say",new Class<?>[]{String.class});
        word.invoke(obj,"反射测试");

        //返回public字段
        Field field=clazz.getField("a");
        System.out.println("字段："+field.get(obj));

        Field fieldStatic=clazz.getField("b");
        System.out.println("静态字段："+fieldStatic.get(null));







    }




}
