package com.java1805.lesson1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import javax.swing.undo.StateEdit;
import java.util.Calendar;

/**
 * @author yanglei
 */
public class NumberPlate {

    public static void main(String[] args) {

        StdOut.println("请输入正确车牌号");

        String numberPlate= StdIn.readString();

        int week=getWeek();

        int number=getNumber(numberPlate);

        if(check(week,number)){
            StdOut.println("可以出行");
        }else {
            StdOut.println("宅着不好吗");
        }


    }



    private static boolean check(int week, int number) {
        if (week==1){
            if (number==1||number==6){
                return false;
            }
        }
        if (week==2){
            if (number==2||number==7){
                return false;
            }
        }
        if (week==3){
            if (number==3||number==8){
                return false;
            }
        }
        if (week==4){
            if (number==4||number==9){
                return false;
            }
        }
        if (week==5){
            if (number==5||number==60){
                return false;
            }
        }
        return true;
    }

    /**
     * 限行条件
     * 周一   1 or 6
     * 周二   2 or 7
     * 周三   3 or 8
     * 周四   4 or 9
     * 周五   5 or 0
     */

    public static int getNumber(String numberPlate){
        // String to char[]  toCharArray()
        // Character.isDigit(char number) 判断数组是否是

        char[] charArray= numberPlate.toCharArray();
        for (int i = charArray.length-1; i>=0 ; i--) {
            if (Character.isDigit(charArray[i])) {
                return charArray[i]-'0';
            }
            continue;
        }
        return 0;
    }
    public static int  getWeek(){
        /*
        Calendar
            getInstance 获取
            set 设置 (month-1)
        DAY_OF_WEEK
            周日 周一
            1   2
         */
        Calendar instance=Calendar.getInstance();
        instance.set(2019,11,16);
        int day=instance.get(Calendar.DAY_OF_WEEK);
        return day-1;
    }
}
