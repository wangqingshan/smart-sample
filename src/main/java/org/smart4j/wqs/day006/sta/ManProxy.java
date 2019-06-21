package org.smart4j.wqs.day006.sta;

import sun.applet.Main;

/**
 * ManProxy
 *
 * @Title: ManProxy.java
 * @Copyright: Copyright (c) 2005
 * @Description: 静态代理的一个最大缺陷：接口与代理类是1对1的，有多个接口需要代理，就需要新建多个代理类，繁琐，类爆炸。
 * @Company: 互动百科
 * @Created on 2019-6-20 9:43
 * @Author 90
 */
public class ManProxy implements IPerson{

    private IPerson target;

    @Override
    public void say() {
        if(target!=null){
            System.out.println("当前时间："+System.currentTimeMillis());
            target.say();
        }

    }

    public IPerson getTarget(){
        return target;
    }

    public ManProxy setTarget(IPerson target){
        this.target=target;
        return this;
    }

    public static void main(String[] args) {
        Man man=new Man();
        ManProxy proxy=new ManProxy();
        proxy.setTarget(man);
        proxy.say();
    }



}
