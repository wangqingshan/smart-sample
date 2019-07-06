package org.smart4j.wqs.day001;

/**
 * author 90
 * description 测试成员变量
 * date 2019/6/15
 */
public class Test {

    private int a;

    public static void main(String[] args) {
        int b;
        System.out.println(new Test().a);
        //System.out.println(b); 注意局部变量不能这样用
        //即使在初始化阶段程序员没有为类变量赋值也没有关系，类变量仍然具有一个确定的初始值。但局部
        //变量就不一样，如果一个局部变量定义了但没有赋初始值是不能使用的，不要认为java中任何情况下
        //都存在诸如整型变量默认为0，布尔变量默认为false等这样的默认值。
    }
}
