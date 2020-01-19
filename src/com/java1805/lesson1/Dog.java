package com.java1805.lesson1;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author yanglei
 * 继承 extends
 * A extends
 */
public class Dog extends Animal {

    int legNumber;
    //子类的特有属性


    public void run(){
        StdOut.println("跑");
    }

    @Override
    public void eat() {
        StdOut.println("狗吃肉");
    }
}
