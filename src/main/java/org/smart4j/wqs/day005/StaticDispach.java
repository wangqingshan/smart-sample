package org.smart4j.wqs.day005;

/**
 * author 90
 * description 静态分发
 * date 2019/6/15
 */
public class StaticDispach {

    static abstract class Human{

    }

    static  class Man extends Human{

    }

    static class Woman extends Human{

    }

    public void sayHello(Human guy){
        System.out.println("hello guy");
    }
    public void sayHello(Woman guy){
        System.out.println("hello woman");
    }
    public void sayHello(Man guy){
        System.out.println("hello man");
    }


    public static void main(String[] args) {
        Man man=new Man();
        Woman woman=new Woman();
        StaticDispach ds= new StaticDispach();
        ds.sayHello(man);
        ds.sayHello(woman);
    }


}
