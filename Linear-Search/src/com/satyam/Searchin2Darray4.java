package com.satyam;


import java.util.Arrays;

public class Searchin2Darray4 {
    public static void main(String[] args) {
        int[][] arr = {{1,23,3},
                      {4,5,6,8},
                      {32,23,2} };
        int[] ans = linearsearch(arr,8);
        System.out.println(Arrays.toString(ans));
    }

    static int[] linearsearch(int[][] arr , int target){
        for (int i = 0; i < arr.length ; i++) {
            for(int j=0 ; j < arr[i].length ; j++){
                if(arr[i][j] == target){
                    return new int[]{i,j};
                }
            }

        }
        return new int[]{0,0};

    }
}
