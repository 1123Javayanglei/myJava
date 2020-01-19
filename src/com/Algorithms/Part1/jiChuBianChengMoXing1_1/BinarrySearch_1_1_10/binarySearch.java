package com.Algorithms.Part1.jiChuBianChengMoXing1_1.BinarrySearch_1_1_10;

import edu.princeton.cs.algs4.StdOut;

import java.lang.management.MemoryType;
import java.util.Arrays;

public class binarySearch {
    public static int BinarySearch(int[] array, int target) {       //array 有序数组 target 查找值  复杂度 O long(N)
        int start = 0; // 查找范围起点
        int end = array.length - 1; //查找范围终点
        int mid;  //查找范围的中位数
        while (start <= end) {
//            mid=(start+end)/2;
            mid = start + (end - start) / 2; // 查找范围缩小一半
            /*
            若start和end过大 会溢出  变加为减
            解决办法: mid=start+(end-start)
             */
            if (target < array[mid]) {  //查找的值小于a[mid] 就在左边查找
                end = mid - 1;
            } else if (target > array[mid]) { //查找的值大于a[mid] 就在右边查找
                start = mid + 1;
            } else {
                return mid;  //查找的值等于a[mid] 返回mid
            }
        }
        return -1;  //没找到返回 -1
    }

    public static void main(String[] args) {
        int N = 10;
        System.out.println("long(N)的复杂度:" + Math.log(N));
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = i;
        }
        Arrays.sort(array);  //要查找的数组必须是有序的

        System.out.println("排序后:" + Arrays.toString(array));

        System.out.println(BinarySearch(array, 8));
    }
}