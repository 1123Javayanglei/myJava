package com.Algorithms.Part1.jiChuBianChengMoXing1_1.questionAndAnswer;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class textQuestionAndAnswer {
    public static void main(String[] args) {
//        System.out.println(Math.abs(-2147483648)); //数据溢出
//        //1.1.1 给出下面表达式的值
//        System.out.println((0+15)/2);
//        /*
//        1.39e-43 表示1.39乘以10的负43次方
//         */
//        System.out.println(2.0e-6*100000000.0);
//        System.out.println(true && false || true && true);
//
//        //1.1.2 给出以下表达式的类型和值
//        System.out.println((1+2.236)/2 );
//        System.out.println(1+2+3+4.0);
//        System.out.println(4.1>=4);
//        System.out.println(1+2+"3"); // int 3 + String 3 = 33

        //1.1.3 编写一个程序，从命令行得到三个整数参数，如果都相等打印equal,否则打印not equal

//        int numberOfOne=StdIn.readInt();
//        int numberOfTwo=StdIn.readInt();
//        int numberOfThere=StdIn.readInt();
//        if ((numberOfOne==numberOfTwo)&&(numberOfTwo==numberOfThere)){
//            StdOut.print("equal");
//        }else {
//            StdOut.print("not equal");
//        }


        //1.1.4 下列语句有什么问题？
//        int a=1;
//        int b=2;
//        int c;
//        // if(a>b) c=0 else b=0; ❌ 需要 c=0;
//        if(a>b) c=0; else b=0;

        //1.1.5 编写一段程序，if double x,y [0,1] print true; else print false
//        double numberOfX=StdIn.readDouble();
//        double numberOfY=StdIn.readDouble();
//        if ((numberOfX>0.0 && numberOfX<1.0)&&(numberOfY>0.0 && numberOfY<1.0)) StdOut.print("true");
//        else StdOut.print("false");

        //1.1.6 打印 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610
//        int f=0;
//        int g=1;
//        for (int i = 0; i <=15; i++) {
//            StdOut.print(f+" ");
//            f=f+g;
//            g=f-g;
//
//        }

        //1.1.7 给出下列代码打印出的值
        //a
//        double t=9.0;
//        StdOut.printf("while前t=%f\n",t);
//        StdOut.print(Math.abs(t-9.0)/t>0.001);
//        while (Math.abs(t-0.9/t)> 0.001) {
//            t = (9.0 / t + t) / 2.0;
//        }
//        StdOut.printf("while后t=%f\n",t);
//        System.out.println(t);

        //b
//        int sum=0;
//        for (int i = 1; i < 1000; i++) {
//            for (int j = 0; j < i; j++) {
//                sum++;
//            }
//        }
//        StdOut.println(sum);

        //c
//        int sum=0;
//        for (int i = 1; i < 1000; i*=2) {
//            for (int j = 0; j < i; j++) {
//                sum++;
//            }
//        }
//        StdOut.println(sum);

        //1.1.8 下列语句会打印出什么结果
//        System.out.println('b');
//        System.out.println('a'+'b'); //a ascii = 97 b ascii=98  ..... 'a'+0 打印出ascii 97+98
//        System.out.println((char)('a'+4)); //a=97 b=98 c=99 d=100 e=101     (char)(a+4)=97+4=101=e
    }
}
