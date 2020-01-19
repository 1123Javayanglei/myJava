package com.java1805.lesson0;

/**
 * @author yanglei
 */
public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,10,6,8,5,3,};
        bubbleSort1(arr, arr.length);
        for(int i:arr){
            System.out.print(i+",");
        }
    }
    public static void bubbleSort1(int [] a, int n){
        int i, j;
        for(i=0; i<n; i++){
            //表示n次排序过程。
            for(j=1; j<n-i; j++){
                if(a[j-1] > a[j]){
                    //前面的数字大于后面的数字就交换
                    //交换a[j-1]和a[j]
                    int temp;
                    temp = a[j-1];
                    a[j-1] = a[j];
                    a[j]=temp;
                }
            }
        }
    }// end
}
