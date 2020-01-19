package com.java1805.lesson1;

import edu.princeton.cs.algs4.StdOut;

import java.lang.Throwable;

import java.util.Map;

/**
 * @author yanglei
 *
 * 继承 extends
 *
 * A extends B
 * A继承B，B是父类，A是子类
 * java只支持单继承 一个子类只能有一个父类
 * 支持多层次继承
 * 子类只能继承父类非私有的方法
 * 父类不能访问其子类中的属性和方法
 *
 * object 类是所有类的超类
 * ------------------------------
 * 子父类属性问题:
 * 子类可以有自己特有的属性
 * ->子类没有的，调用父类
 * ->子类有的，默认调用自己的
 *
 * 子父类的方法问题:
 * ->子类可以有自己特有的方法
 * ->子类可以有与父类同名的的方法 <----> 重写(Override)
 *  1.子类重写后的方法访问修饰符的权限 >= 父类的 private不能重写
 *  2.返回值类型保持一致
 *  3.方法名保持一致
 *  4.参数列表保持一致
 *  5.子类抛出的异常范围 <= 父类的异常范围
 */
public class Animal{
    int age=10;
    String color;
    public void eat(){
        StdOut.println("吃");
    }




}
