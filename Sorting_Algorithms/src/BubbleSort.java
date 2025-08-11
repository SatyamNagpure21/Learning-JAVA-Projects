import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
//        int[] arr = {9,8,7,6,5,4,1,3,2,1};
          int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(bubblesort(arr)));
    }

    static int[] bubblesort(int[] arr){
        boolean swapped = false;

        for(int i=0; i<arr.length-1 ;i++){
            for(int j=0 ;j<arr.length-i-1; j++){
//                int temp = 0;
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
        if(!swapped){
            break;
        }
        }

        return arr;
    }
}
