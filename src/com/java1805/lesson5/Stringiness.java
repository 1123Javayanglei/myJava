package com.java1805.lesson5;

/**
 * @author yanglei
 */
public class Stringiness {
    public static void main(String[] args) {
        String str1="HelloWorldSay";
        String str2="WORLD";
        String str4=",";
        String str3=" "+str4+str1+str4+str2+str4+" ";
        System.out.println("str3:"+str4+str3);
        System.out.println("去掉str3首尾的空格"+str4+str3.trim());
        System.out.println("str1的长度:"+str1.length());
        System.out.println("str1第一次出现l的位置"+str1.indexOf("l"));
        System.out.println("str1最后一次出现l的位置"+str1.lastIndexOf("l"));
        System.out.println("str1索引1的字符是:"+str1.charAt(1));
        //charAt 取值范围0～字符串长度-1
        System.out.println("str1是否以he开头:"+str1.startsWith("ab"));
        System.out.println("str1是否以lo结尾:"+str1.endsWith("lo"));
        System.out.println("str1和\'HelloWorldSay'是否一致:"+str1.equals("HelloWorldSay"));
        System.out.println("str1转换为大写字母:"+str1.toUpperCase());
        System.out.println("str2转换为小写字母:"+str2.toLowerCase());

        char[] strlArray=str1.toCharArray();
        System.out.println("转为数组后:");
        for (char c:strlArray){
            System.out.println(c+" ");
        }
        System.out.println("str1的hello替换为uplay:"+str1.replace("HelloWorldSay","uplay"));
        System.out.println("str3根据','拆分后:");
        String[] strraay=str3.split(",");
        for (String str:strraay){
            System.out.println(str+" ");
        }
        System.out.println("str1从第一位截取: "+str1.substring(1));
        System.out.println("str1从第一位到第三位是: "+str1.substring(1,3));
        System.out.println("去掉str3首尾的空格之前:"+str3);
        System.out.println("去掉str3首尾的空格之后:"+str3.trim());

    }
}
