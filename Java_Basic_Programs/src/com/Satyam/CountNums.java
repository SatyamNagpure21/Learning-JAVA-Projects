package com.Satyam;

import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int  n = in.nextInt();
        int count = 0;

        while(n>0){
            if(n%10 == 5){
                count++;
            }
            n = n/10 ;
        }
        System.out.println("Number of 5 in given number is "+count+" .");
    }
}
