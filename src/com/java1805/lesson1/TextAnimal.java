package com.java1805.lesson1;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author yanglei
 */
public class TextAnimal {

    public static void main(String[] args) {

        Dog dog=new Dog();

        int dogAge=dog.age;

        StdOut.println(dogAge);

        dog.eat();


        int dogNum=dog.legNumber;

        Cat cat=new Cat();
        int catAge=cat.age;


        Pig pig=new Pig();

        int pigAge=pig.age;

    }
}
