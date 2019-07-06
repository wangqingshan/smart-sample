package org.smart4j.wqs.day005;

/**
 * author 90
 * description 来自网络的静态分配
 * date 2019/6/15
 */
public class StaticDispach2 {


    static abstract class Human{
    }
    static class Man extends Human{
    }
    static class Woman extends Human{
    }
    public void sayHello(Human guy){
        System.out.println("hello,guy！");
    }
    public void sayHello(Man guy){
        System.out.println("hello,gentleman！");
    }
    public void sayHello(Woman guy){
        System.out.println("hello,lady！");
    }
    public static void main(String[]args){
        Human man=new Man();
        Human woman=new Woman();
        StaticDispach2 sr=new StaticDispach2();
        sr.sayHello(man);
        sr.sayHello(woman);
    }

}
