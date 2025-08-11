package com.methodQuestions;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to check its prime: ");
        int n = in.nextInt();

        System.out.println("Prime: "+isPrime(n));

        System.out.println("Armstrong number: "+isArmstrong(n));

        System.out.print("Armstrong numbers [0-999]: ");

        for (int i=0; i<1000 ; i++){
            if(isArmstrong(i)){
                System.out.print(i + " ");
            }
        }
    }

    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c = 2;
        while(c * c <= n){
            if(n % c == 0){
                return false;
            }
            c++;
        }

//        return c * c > n;
        return true;
    }

    static boolean isArmstrong(int n){
        int original = n ;
        int sum = 0 ;
        while(n > 0){
            int rem = n % 10 ;
            sum = sum + rem*rem*rem;
            n = n/10;
        }
        return sum == original;
    }
}
