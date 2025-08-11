package com.Satyam;

import java.util.Scanner;

// Fibbonacci series
public class Fibo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the n : ");
        int n = in.nextInt();
        int a = 0 ;
        int b = 1 ;
        int count = 2 ;

//        for(int count = 2 ; count <= n ;count ++){
//            int temp = b ;
//            b = b + a ;
//            a = temp ;
//        }
        while (count <= n){
            int temp = b;
            b =b+a;
            a=temp;
            count++;
        }
        System.out.println(b);


    }
}
