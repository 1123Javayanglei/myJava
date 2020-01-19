package com.java1805.lesson1;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author yanglei
 */
public class Phone {
    /**
     * private 只能在当前类中访问 自己用
     *
     * 类的封装:
     *  属性私有化
     *  提供公共可以设置（set）和访问（get）的方法
     */

    private double price;
    private String type;

    public void setPrice(double price) {
        //赋值

        if (price>0){
            this.price = price;
            //this 语句
        }else {
            StdOut.print("金额不能为负数");
        }

    }

    public double getPrice() {
        //取值
        return price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public boolean call(int phoneNumber){
        System.out.println("给"+phoneNumber+"打电话");
        return false;
    }
}
