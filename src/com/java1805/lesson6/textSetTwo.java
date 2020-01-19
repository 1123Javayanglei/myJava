package com.java1805.lesson6;

import java.util.HashSet;
import java.util.Set;

public class textSetTwo {
    public static void main(String[] args) {
        textStudent s1=new textStudent("001","张三");
        textStudent s2=new textStudent("002","李四");
        textStudent s3=new textStudent("002","李四");
        Set<textStudent> set=new HashSet<textStudent>();
        set.add(s1);
        set.add(s2);
        set.add(s3);
        System.out.println(set);
    }
}
