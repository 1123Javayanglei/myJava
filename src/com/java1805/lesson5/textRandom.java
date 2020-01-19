package com.java1805.lesson5;

import java.util.Random;

public class textRandom {
    private final static String STR="abcdefghijklmnopqrstuvwxyz";
    public static void main(String[] args) {
      System.out.println(generateRand(5));
    }

    public  static String generateRand(int x){
        StringBuffer sb=new StringBuffer();
        for (int i=0;i<x;i++){
            sb.append(getRandomChar(i));
        }
        return sb.toString();
    }

    public static String getRandomChar(int length){
        Random random =new Random();
        int num=random.nextInt(STR.length());
        return STR.charAt(num)+"";
    }

}
