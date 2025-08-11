package com.methodQuestions;

import java.util.Scanner;

public class SumCode {
    public static void main(String[] args) {
        greetings();
        sum();
        System.out.println(mygreet("Satyam "));
    }

    static String mygreet(String name){
        String f = " "+name +" ";
        return f;
    }

    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a : " );
        int a =in.nextInt();
        System.out.print("Enter b: ");
        int b = in.nextInt();
        System.out.println("Sum = "+(a+b));

    }

    static void greetings(){
        System.out.println("नमस्ते \uD83D\uDE4F");
    }
}
