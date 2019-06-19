package org.smart4j.wqs.day005;

/**
 * InvokeObj
 *
 * @Title: InvokeObj.java
 * @Copyright: Copyright (c) 2005
 * @Description: 测试反射
 * @Company: 互动百科
 * @Created on 2019-6-18 16:20
 * @Author 90
 */
public class InvokeObj {

    public void print(){
        System.out.println("hello world!");
    }

    public int print(int a, int b) {
        System.out.println("print:"+(a + b));
        return a+b;
    }

    public void print(String a, String b) {
        System.out.println(a.toUpperCase() + "," + b.toLowerCase());
    }








}
