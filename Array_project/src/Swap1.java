import java.util.Arrays;

public class Swap1 {
    public static void main(String[] args) {
        int[] arr = {1,3,23,9,18};
        System.out.println("Original Array: "+Arrays.toString(arr));
        swap(arr,1,3);
        System.out.println("Swapped Array: "+Arrays.toString(arr));
    }
    static void swap(int[] arr,int a,int b){
        int temp = arr[b];
        arr[b] = arr[a] ;
        arr[a] = temp;
    }
}
