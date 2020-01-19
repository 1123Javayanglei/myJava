package com.java1805.lesson6;

import java.util.ArrayList;

public class textList {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("刘六");
        System.out.println("第一次输入list的内容:");
        System.out.println(list.toString());
        list.add(1,"南阳");
        list.set(2,"西峡");
        System.out.println("list的长度是:"+list.size());
        System.out.println("list的第三个索引位置的元素是:"+list.get(3));
        list.remove("王五");
        System.out.println("删除王五之后list的结果是:"+list.toString());
        System.out.println("list是否包含南阳"+list.contains("南阳"));
        System.out.println("张三在list中第一次出现是在:"+list.indexOf("张三"));
        System.out.println("张三在list中最后一次出现是在:"+list.lastIndexOf("张三"));
        list.removeAll(list);
        System.out.println("list清空之后是:"+list.toString());
    }
    private static String listToString(ArrayList<? extends Object> l){
        StringBuffer sb=new StringBuffer();
        sb.append("|");
        for (Object o:l) {
            sb.append(o.toString()).append(" ");
        }
        sb.append("|");
        return sb.toString();
    }
}
