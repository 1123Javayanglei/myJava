package com.java1805.lesson6;

import java.util.*;
import java.util.List;

public class textCard{
    public static void main(String[] args) {
        List<String> colors =new ArrayList<String>();  //定义四个花色 创建colors集合对象并指定范型为String
        colors.add("♥️");
        colors.add("♦️");
        colors.add("♠️");
        colors.add("️♣️");

        List<String> numberList= new ArrayList<String>(); //定义同一个花色的所有牌的集合
        for (int i = 2; i <=10; i++) { //2~10
            numberList.add(i+"");

        }
        numberList.add("A"); //A~K
        numberList.add("J");
        numberList.add("Q");
        numberList.add("K");
System.out.println(numberList); //1~13的手牌
        System.out.println(colors); //四个花色
        Map<Integer,String> cards = new HashMap<Integer,String>(); //构造一副纸牌，除了大小王之外的所有牌的集合
        int index =0;
        for (String color :
                colors) {
            for (String number :
                    numberList) {
                cards.put(index ++,color+number);
            }
        }

        cards.put(index ++,"大王");
        cards.put(index ++,"小王");  //一副纸牌的54张牌生产ok

        List<Integer> indexList=new ArrayList<Integer>();

        for (int i = 0; i < 54; i++) {
            indexList.add(i);
        }
System.out.println(indexList);
        Collections.shuffle(indexList); //打乱牌
        System.out.println(indexList);
//        System.out.println(indexList);

        List<Integer> p1CardsIndex=new ArrayList<Integer>();
        List<Integer> p2CardsIndex=new ArrayList<Integer>();
        List<Integer> p3CardsIndex=new ArrayList<Integer>();
        List<Integer> diCardsIndex=new ArrayList<Integer>();

        for (int i = 0; i < indexList.size(); i++) {
            if (i<=50){ //给玩家发配 else 底牌
                if (i%3==0){
                    p1CardsIndex.add(indexList.get(i));
                }if(i%3==1){
                    p2CardsIndex.add(indexList.get(i));
                }if(i%3==2){
                    p3CardsIndex.add(indexList.get(i));
                }
            }else {
                diCardsIndex.add(indexList.get(i));
            }
        }

        Collections.sort(p1CardsIndex); //排序
        Collections.sort(p2CardsIndex);
        Collections.sort(p3CardsIndex);
        Collections.sort(diCardsIndex);

        List<String> p1cards=new ArrayList<String>();
        List<String> p2cards=new ArrayList<String>();
        List<String> p3cards=new ArrayList<String>();
        List<String> dicards=new ArrayList<String>();

        for (Integer cardsIndex:

             p1CardsIndex ) {
            p1cards.add(cards.get(cardsIndex));
        }
        for (Integer cardsIndex:
                p2CardsIndex ) {
            p2cards.add(cards.get(cardsIndex));
        }
        for (Integer cardsIndex:
                p3CardsIndex ) {
            p3cards.add(cards.get(cardsIndex));
        }
        for (Integer cardsIndex:
                diCardsIndex ) {
            dicards.add(cards.get(cardsIndex));
        }

        System.out.println("p1:"+p1cards);
        System.out.println("p2:"+p2cards);
        System.out.println("p3:"+p3cards);
        System.out.println("di:"+dicards);



    }
}
