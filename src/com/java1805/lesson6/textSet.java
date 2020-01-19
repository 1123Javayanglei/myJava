package com.java1805.lesson6;

import java.util.HashSet;
import java.util.Set;

public class textSet  {
    public static void main(String[] args) {

        Set<String> set=new HashSet<>();

        set.add("jack");
        set.add("Eve");
        set.add("Rose");
        set.add("Rose");

        System.out.println(set.toString());

        for (String s : set) {
            System.out.println(s.toString());
        }

    }
}
