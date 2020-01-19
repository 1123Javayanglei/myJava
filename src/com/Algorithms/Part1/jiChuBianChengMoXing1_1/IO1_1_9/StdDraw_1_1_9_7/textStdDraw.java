package com.Algorithms.Part1.jiChuBianChengMoXing1_1.IO1_1_9.StdDraw_1_1_9_7;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

import java.awt.*;

public class textStdDraw {
    //函数值
    public static void main(String[] args) {
        int N=100;
        StdDraw.setPenColor(Color.red); //画笔颜色
        StdDraw.setCanvasSize(1000/2,1000/2); //调整窗口
        StdDraw.setXscale(0,N);
        StdDraw.setYscale(0,N*N);
        StdDraw.setPenRadius(.009);  //🖌️粗细
        for (int i = 1; i <=N ; i++) {
            StdDraw.point(i,i);
            StdDraw.point(i,i*i);
            StdDraw.point(i,i*Math.log(i));
        }

    }
}
