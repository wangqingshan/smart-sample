package org.smart4j.wqs.day007;

import java.util.List;

/**
 * author 90
 * description 测试范型
 * date 2019/7/6
 */
public class Test {

    public void getList(List<String> list){
        System.out.println("测试list");
    }
    //下面这个方法编译不通过，因为java的泛型擦除
    /*public void getList(List<Integer> list){
        System.out.println("测试list");
    }*/


    public static void main(String[] args) {

    }
}
