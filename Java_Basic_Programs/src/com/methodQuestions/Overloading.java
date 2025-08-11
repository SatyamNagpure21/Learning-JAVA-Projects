package com.methodQuestions;


//function overloading takes place in compile time

public class Overloading {
    public static void main(String[] args) {
        fun(4);
        fun("Porier");
    }

    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String b){
        System.out.println(b);
    }
}
