package org.smart4j.wqs.day007;

/**
 * author 90
 * description 测试自动拆箱装箱
 * date 2019/7/6
 */
public class TestAuto {

    public static void main(String[] args) {
        Integer a=1;
        Integer b=2;
        Integer c=3;
        Integer d=3;
        Integer e=321;
        Integer f=321;
        Long g=3L;
        System.out.println(c==d);
        System.out.println(e==f);
        System.out.println(c==(a+b));
        System.out.println(c.equals(a+b));
        System.out.println(g==(a+b));
        System.out.println(g.equals(a+b));
        //equals 方法不处理数据转型关系
    }
}
