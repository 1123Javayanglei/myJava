package com.java1805.lesson1;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author yanglei
 */
public class TextOOP {
    public static void main(String[] args) {
        /*
         * 创建对象 / 实例化
         *
         * 类名 对象名 = new 类名();
         *
         * 创建一个人类对象
         */
        People p1=new People();
        /*
         * 使用对象:
         *
         * 使用属性:
         *  获得属性
         *      数据类型 变量名=对象名.属性名;
         *  属性赋值
         *      对象名.属性名=值;
         *
         * 使用方法:
         *  调用方法
         *      对象名.方法名([实参]);
         */

        int age=p1.age;

        String name=p1.name;

        System.out.println(age+name);

        p1.age=18;
        p1.name="张三";
        System.out.println(p1.age+p1.name);
        // 方法没有参数，调用时就不能传入参数

        p1.sleep();
        // 方法有参数，调用时就要传入参数，且类型顺序参数要保持一致
        String s=p1.eat(3,"rice");
        System.out.println("吃饭的感受:"+s);

    }
}
