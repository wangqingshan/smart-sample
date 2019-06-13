package org.smart4j.wqs.day001;

/**
 * Apple
 *
 * @Title: Apple.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-6-12 17:46
 * @Author 90
 */
public class Apple {



    @FruitName(value = "苹果")
    private String name;

    @FruitColor(fruitColor = FruitColor.Color.GREEN)
    private String color;

    @Override
    public String toString(){

        return "水果名"+name+"颜色："+color;

    }


    public static void main(String[] args) {
        System.out.println(new Apple().toString());
    }
}
