package org.smart4j.wqs.day006.cglib;

/**
 * Test
 *
 * @Title: Test.java
 * @Copyright: Copyright (c) 2005
 * @Description: 以子类来实现，父类不能是final方法,否则不会被代理
 * @Company: 互动百科
 * @Created on 2019-6-21 15:53
 * @Author 90
 */
public class Test {

    public static void main(String[] args) {
        CglibUtil cglibUtil=new CglibUtil();

        Panda panda= (Panda) cglibUtil.getInstance(new Panda());
        panda.eat();
    }
}
