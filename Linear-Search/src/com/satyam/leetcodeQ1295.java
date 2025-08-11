package com.satyam;

public class leetcodeQ1295 {
    public static void main(String[] args) {
        int[] a ={13,132 ,1231,2141,21,323,12323,312313,12};
        findNumbers(a);
    }
    static int findNumbers(int[] nums) {
        int count = 0 ;
        for(int i=0 ; i<nums.length ;i++){
            // int n = digits(nums[i]);
            if(iseven(nums[i])){
                count++;
            }
        }
        return count;
    }
    static int digits(int n){
        //to count number of digits
        int count = 0;
        while(n>0){
            count++;
            n=n/10;
        }
        return count;

    }
    static boolean iseven(int n){
        int numberofdigits = digits(n);

        return numberofdigits % 2 == 0;

    }
}
