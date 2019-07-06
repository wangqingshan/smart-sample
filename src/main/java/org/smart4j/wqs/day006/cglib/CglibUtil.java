package org.smart4j.wqs.day006.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * CglibUtil
 *
 * @Title: CglibUtil.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-6-21 15:47
 * @Author 90
 */
public class CglibUtil implements MethodInterceptor {

    private Object target;
    public Object getInstance(Object target){
        this.target=target;
        Enhancer enhancer=new Enhancer();
        //设置父类为实例类
        enhancer.setSuperclass(this.target.getClass());
        //回调方法
        enhancer.setCallback(this);
        //创建代理对象
        return enhancer.create();

    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("调用前===");

        Object result=methodProxy.invokeSuper(o,objects);
        System.out.println("调用后===");
        return result;
    }
}
