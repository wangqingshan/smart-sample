package org.smart4j.wqs.day007;

import java.util.List;

/**
 * author 90
 * description 测试重载
 * date 2019/7/6
 */
public class TestLoad {

    /*public int num(List<Integer> b){
        return b;
    }*/

    //深入理解jvm虚拟机336页的示例，不明白
    public String num(List<String> b){
        return b+"";
    }
}
