package com.java1805.lesson6;

public class textStudent {
    private  String number;
    private  String name;
    textStudent(String number, String name){
        this.number=number;
        this.name=name;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number){
        this.number=number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String toString(){
        return "|学生的学号是:" + number +
                ",学生的姓名是:" + name +
                "|";
    }

    public int hashCode(){
        return number.hashCode();
    }
    public boolean equals(Object obj){
        if (this == obj) {
            return true;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        textStudent s=(textStudent)obj;
        return this.number.equals(s.number);

    }

    public static void main(String[] args) {

    }

}
