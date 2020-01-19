package com.Algorithms.Part1.jiChuBianChengMoXing1_1.jianBianJiFa1_1_4.textString1_1_8;

import edu.princeton.cs.algs4.StdOut;

public class stringStrcat1_1_8 {
    public static void main(String[] args) {
        //1.字符串拼接 one+two+there=ABHello2.5
        String one="AB";
        String two="Hello";
        String there="2.5";
        String thereTwo="567";
        System.out.println(one+two+there);
        //2.类型转换
        int five=Integer.parseInt(thereTwo); //整数
        System.out.println("String to int: "+five);

        double six=Double.parseDouble(there); //浮点数
        System.out.println("String to double: "+six);
        StdOut.print(two);
        //1.1.8.3 自动转换



    }
}
