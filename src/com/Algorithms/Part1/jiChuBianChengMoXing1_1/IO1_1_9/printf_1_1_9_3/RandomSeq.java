package com.Algorithms.Part1.jiChuBianChengMoXing1_1.IO1_1_9.printf_1_1_9_3;

//格式化输出 输出N个lo到hi的随机浮点数字
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
public class RandomSeq {
    public static void main(String[] args) {
        int N=Integer.parseInt(args[0]);
        double lo=Double.parseDouble(args[1]);
        double hi=Double.parseDouble(args[2]);
        for (int i = 0; i < N; i++) {
            double x= StdRandom.uniform(lo,hi);
            StdOut.printf("%.2f\n",x);
        }
    }
}
