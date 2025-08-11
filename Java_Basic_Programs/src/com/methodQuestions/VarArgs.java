package com.methodQuestions;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(1,2,3,4,5,3,6,78,5,34);
        multiple(1,2,"Satyam","Dan","Mcgregor","Khabib");

    }

    //here you can see ...v that means variable length of numbers can be given in input and saved in an array

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a , int b ,String ...s){


    }
}
