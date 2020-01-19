package com.Algorithms.Part1.jiChuBianChengMoXing1_1.jianBianJiFa1_1_4.shuZu1_1_5;

import java.util.Arrays;

public class userArr {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,};
        int max=arr[0];
        for (int j = 1; j < arr.length ; j++) { //求最大值
            if (arr[j] > max) {
                max=arr[j];
            }
        }
        System.out.println("Max="+max);


        int sum=0;
        for (int i = 0; i < arr.length; i++) {      //求平均值
            sum+=arr[i];
        }
        int average=sum/arr.length;
        System.out.println("Avg="+average);

        for (int i = 0; i < (arr.length) / 2; i++) {    //颠倒下标
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-i-1]=temp;
        }
        System.out.println(Arrays.toString(arr));

    }
}
