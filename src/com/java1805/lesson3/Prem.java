package com.java1805.lesson3;

import java.util.Arrays;

/**
 * @author yanglei
 */
public class Prem {
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c','d'};
        System.out.println(Arrays.toString(arr) + "全排列后:");
        perm(arr, 0, (arr.length - 1));
    }
    private static void swap(char[] arr, int a, int b) {
        char temp;
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    private static void perm(char[] arr, int p, int q) {
        if (p == q) {
            System.out.println(Arrays.toString(arr));
        } else {
            for (int i = p; i <= q; i++) {
                swap(arr, p, i);
                perm(arr, p + 1, q);
                swap(arr, p, i);
            }
        }
    }
}
