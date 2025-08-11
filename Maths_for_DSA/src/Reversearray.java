import java.util.Arrays;
import java.util.Collections;

public class Reversearray {
    public static void main(String[] args) {
        Integer[] arr = {28,11,3,4,5,6,7543,22,1,0};

        Arrays.sort(arr);
        Arrays.sort(arr, Collections.reverseOrder());



        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
