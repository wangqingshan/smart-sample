package org.smart4j.wqs.day005;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Test
 *
 * @Title: Test.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-6-18 16:40
 * @Author 90
 */
public class Test {


    /**
     * 1 获取该类的Class Type  2 通过getMethod方法获取Method对象  3 通过invoke方法来执行对象的某个方法，这里要特别
     * 注意下getMethod 方法和 invoke方法参数。
     * @param args
     */
    public static void main(String[] args) {
        try {
            Class<?> clazz=Class.forName("org.smart4j.wqs.day005.InvokeObj");
            try {
                Object beanInstance=clazz.newInstance();

                try {
                    Method m=clazz.getMethod("print", new Class[]{int.class,int.class});
                    Method m2=clazz.getMethod("print", int.class,int.class);

                    try {
                        //有返回值的
                        Object o = m.invoke(beanInstance,new Object[]{10,20});
                        Object o2 = m2.invoke(beanInstance,10,40);

                        System.out.println(o.toString());
                        System.out.println(o2.toString());

                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    }
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                }
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
