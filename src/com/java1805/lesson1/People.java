package com.java1805.lesson1;

import edu.princeton.cs.algs4.StdOut;

import java.lang.ref.SoftReference;

/**
 * @author yanglei
 */
public class People {
    /**
     *属性
     *[访问修饰符]数据类型 属性名(变量名)
     */
    public int age;
    public String name;

    /**
     * 方法
     *
     *[访问修饰符] 返回值类型 方法名(参数列表){
     *  ···
     * }
     * 返回值类型: void 不🔙
     *           可以写任意的数据 --> 写什么类型，🔙什么类型
     * 参数列表: 方法执行所需要的数据,其中可以写多个参数,多个参数用","隔开
     *          语法: 数据类型 变量名,数据类型 变量名
     */
    public String eat (int num,String food){
        System.out.println("eat "+num+"碗 "+food);
        return " Good";
    }
    public void sleep(){
        StdOut.print("sleep\n");
    }


}
