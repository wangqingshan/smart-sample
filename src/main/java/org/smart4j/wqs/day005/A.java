package org.smart4j.wqs.day005;

/**
 * A
 *
 * @Title: A.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-6-19 14:22
 * @Author 90
 */
public class A {

    public int a=1;
    public static int b=2;

    public A(){
        System.out.println("无参构造函数");
    }

    private A(String s){
        System.out.println("有参构造函数"+s);
    }
    public A(int a){
        System.out.println("a参构造函数");
    }

    public void say(){
        System.out.println("打印-say");
    }

    public void say(String words){
        System.out.println("打印-say:"+words);
    }
}
