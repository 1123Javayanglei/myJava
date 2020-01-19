package com.java1805.lesson6;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class textTreeSet {
    public static void main(String[] args) {

        Set<Integer> set=new TreeSet<Integer>((Comparator<? super Integer>) (o1, o2) -> o2.toString().compareTo(String.valueOf(Integer.valueOf(o1.toString()))));
        //一行冒泡

        for (int i = 0; i < 100; i++) {
            set.add(i);
        }
//        set.add(1);
//        set.add(2);
//        set.add(3);
//        set.add(4);
//        set.add(5);

        System.out.println(set);
    }
}
