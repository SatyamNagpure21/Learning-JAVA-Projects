package com.Satyam;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;


        while (true) {

            System.out.print("Enter the operation : ");
            char ch = in.nextLine().trim().charAt(0);


            if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%'){
                System.out.print("Enter a : ");
                int a = in.nextInt();
                System.out.print("Enter b : ");
                int b = in.nextInt();

                if(ch == '+'){
                    ans = a+b;
                }
                if(ch == '-'){
                    ans = a-b;
                }
                if(ch == '*'){
                    ans = a*b;
                }
                if(ch == '/'){
                    ans = a/b;
                }
                if(ch == '%'){
                    ans = a%b;
                }

            }
            else if (ch == 'x' || ch == 'X') {
                break ;
            } else{ System.out.println("Invalid operator."); } break ;
        }
        System.out.println("Answer = "+ans);


    }
}
