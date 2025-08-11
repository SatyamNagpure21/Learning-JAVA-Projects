package com.satyam;

public class Findmin {
    public static void main(String[] args) {
        int[] arr = {12 ,32 ,44 ,56 ,70 ,-9 ,43 ,123};

        System.out.println(min(arr));

    }

    static int min(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if(arr[i] < min){
                min = arr[i];
            }

        }
        return min;

    }
}
