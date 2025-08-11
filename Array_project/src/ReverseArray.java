import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        System.out.println("Original Array : "+Arrays.toString(arr));

        reverse(arr);

        System.out.println("Reversed Array : "+Arrays.toString(arr));

    }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1 ;
        while(start < end ) {
            swap(arr, start, end);
            start++;
            end--;
        }

    }

    static void swap(int[] arr,int a,int b){
        int temp = arr[b];
        arr[b] = arr[a] ;
        arr[a] = temp;
    }
}
