package org.smart4j.wqs.day005;

/**
 * author 90
 * description 动态分配，override 重写
 * date 2019/6/15
 */
public class DynamicDispach {

    static abstract class Human{

        protected abstract void sayHello();
    }

    static  class Man extends Human{

        @Override
        protected void sayHello() {
            System.out.println("man say hello");
        }
    }

    static  class Woman extends Human{

        @Override
        protected void sayHello() {
            System.out.println("woman say hello");
        }
    }

    public static void main(String[] args) {
        Human man =new Man();
        Human woman=new Woman();
        man.sayHello();
        woman.sayHello();
    }

}
