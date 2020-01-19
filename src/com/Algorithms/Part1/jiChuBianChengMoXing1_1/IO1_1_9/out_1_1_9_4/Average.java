package com.Algorithms.Part1.jiChuBianChengMoXing1_1.IO1_1_9.out_1_1_9_4;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
//求avg
public class Average  {
    public static void main(String[] args) {
        double sum=0.0;
        int cnt=0;
        while (!StdIn.isEmpty()){
            sum+=StdIn.readDouble();
            cnt++;
        }
        double avt=sum/cnt;
        StdOut.printf("Average is %.5f\n",avt);
    }
}
