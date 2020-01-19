package com.Algorithms.Part1.jiChuBianChengMoXing1_1.jianBianJiFa1_1_4.shuZu1_1_5;

import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;

import javax.xml.stream.events.StartDocument;
import java.sql.DriverManager;
import java.util.Arrays;

public class createArr {
    private static DriverManager StdOut;

    public static void main(String[] args) {
        int x=-1;
        if(x>0) x=-x;
        else x=5;
        System.out.println(x);
        int []arr;              //复杂
        arr=new int[5];
        double []brr=new double[10];       //简单
        int []crr={1,2,3,4,5};      //创建数组并赋值
        System.out.println(Arrays.toString(arr)+Arrays.toString(brr));
        System.out.println(Arrays.toString(crr));
        System.out.println(StdStats.max(crr));  //导入包，求数组最大值
        System.out.println(StdRandom.uniform());



    }
}
