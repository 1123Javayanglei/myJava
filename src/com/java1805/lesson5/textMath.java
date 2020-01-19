package com.java1805.lesson5;

public class textMath {
    public static void main(String[] args) {
        System.out.println("计算绝对值:"+Math.abs(-20));
        System.out.println("大于20.5的最大整数"+Math.ceil(20.5));
        System.out.println("小于20.5的最大整数"+Math.floor(20.5));
        System.out.println("3.1415四舍五入:"+Math.round(3.1415));
        System.out.println("半径为6的圆的面积:"+Math.PI*Math.pow(6,2));
        System.out.println("求两个数的最大值"+Math.max(2,4));
        System.out.println("求两个数的最小值"+Math.min(5,4));
        System.out.println("生成一个0.0<=x<1.0的随机数:"+Math.random());
    }
}
