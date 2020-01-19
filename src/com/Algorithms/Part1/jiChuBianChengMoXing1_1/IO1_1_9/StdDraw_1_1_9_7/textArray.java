package com.Algorithms.Part1.jiChuBianChengMoXing1_1.IO1_1_9.StdDraw_1_1_9_7;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

public class textArray {
    //随机数组
    public static void main(String[] args) {
        int N=500;
        double[] a=new double[N];
        int S=50;

        for (int i = 0; i < N; i++) {
            a[i]= StdRandom.random();
        }
        for (int i = 0; i < N; i++) {
            double x=1.0*i/N;
            double y=a[i]/2.0;
            double rw=0.5/N;
            double rh=a[i]/2.0;
            StdDraw.filledRectangle(x,y,rw,rh);
        }
    }
}
