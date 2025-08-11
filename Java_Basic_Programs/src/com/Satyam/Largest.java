package com.Satyam;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        //Find the largest number
        int max = a ;
        if(max < b){
            max = b ;
        }
        if(max < c){
            max = c ;
        }
        System.out.println("Max is "+max);

    }
}
