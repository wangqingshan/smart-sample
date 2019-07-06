package org.smart4j.wqs.day006.jdk;

/**
 * Test
 *
 * @Title: Test.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-6-20 16:59
 * @Author 90
 */
public class Test {


    public static void main(String[] args) {

        ProxyUtil proxyUtil=new ProxyUtil();
        Animal dog= (Animal) proxyUtil.getInstance(new Dog());
        dog.eat();


    }


}
