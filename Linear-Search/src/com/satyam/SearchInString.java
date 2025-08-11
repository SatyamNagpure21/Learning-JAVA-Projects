package com.satyam;

import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Satyam Nagpure";
        char target = 'N';

        System.out.println(linearsearch(name,target));
        System.out.println(linearsearch2(name,target ));

        // for creating character array
        System.out.println(Arrays.toString(name.toCharArray()));

        String name1= "Satyam";

        System.out.println(Arrays.toString(name1.toCharArray()));

    }

    static boolean linearsearch(String name,char target){
        if(name.length() == 0){
            return false;
        }
        for (int i = 0 ; i<name.length() ; i++){
            if(name.charAt(i) == target){
                return true ;
            }
        }
        return false;
    }


    // using for each loop
    static boolean linearsearch2(String name,char target){
        if(name.length() == 0){
            return false;
        }
        for (char ch : name.toCharArray() ){
            if(ch == target){
                return true;
            }
        }
        return false;
    }
}
