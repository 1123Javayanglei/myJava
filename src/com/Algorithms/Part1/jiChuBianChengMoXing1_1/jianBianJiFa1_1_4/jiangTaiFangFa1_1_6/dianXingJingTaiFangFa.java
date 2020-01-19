package com.Algorithms.Part1.jiChuBianChengMoXing1_1.jianBianJiFa1_1_4.jiangTaiFangFa1_1_6;

public class dianXingJingTaiFangFa {
    public static void main(String[] args) {
        System.out.println("-5的绝对值:"+abs(-5));
        System.out.println("绝对值:"+ABS(-5.5));
        System.out.println("判断5是否是素数:"+isPrime(5));
        System.out.println("2的开平发是:"+sqrt(2));
        System.out.println("直角三角形7.5,7.5的第三边是:"+hypotenuse(7.5,7.5));
        System.out.println("8的调和级数是:"+H(8));
    }

    public static int abs(int x) {  //绝对值
        if (x > 0) return x;
        else return -x;
    }

    public static double ABS(double x) {  // double绝对值
        if (x > 0.0) return x;
        else return -x;
    }

    public static boolean isPrime(int N) {  //判断一个数是否是素数
        if (N < 2) return false;
        for (int i = 2; i * i <= N; i++)
            if (N % i == 0)
                return false;
        return true;
    }

    public static double sqrt(double c){ //计算平方根 牛顿迭代
        if (c<0) {
            return Double.NaN;
        }
        double err=1e-15;
        double t=c;
        while (Math.abs(t-c/t)>err*t){
            t=(c/t+t)/2.0;
        }
        return t;
    }
    public static double hypotenuse(double a,double b){ //计算直角三角形的斜边
        return Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
    }

    public  static double H(int N){         //计算调和级数
        double sum=0.0;
        for (int i = 0; i < N; i++) {
            sum+=1.0/i;
        }
        return sum;
    }
}
