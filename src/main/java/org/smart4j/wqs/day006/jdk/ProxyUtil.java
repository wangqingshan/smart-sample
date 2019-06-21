package org.smart4j.wqs.day006.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * AnimalProxy
 *
 * @Title: AnimalProxy.java
 * @Copyright: Copyright (c) 2005
 * @Description: 动态代理不依赖于接口,测试jdk的动态代理
 * @Company: 互动百科
 * @Created on 2019-6-20 15:54
 * @Author 90
 */
public class ProxyUtil implements InvocationHandler {


    private Object target;
    public Object getInstance(Object target){
        this.target=target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);

    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("调用前====");
        //方法调用，result为返回值
        Object result=method.invoke(target,args);
        System.out.println("调用后====");
        return result;
    }
}
