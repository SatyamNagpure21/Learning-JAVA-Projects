public class RecursiveBubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int n = 5;

        //using recurssion
        bubblesort(arr,n);

        for(int num : arr){
            System.out.print(num+" ");
        }
    }

    static void bubblesort(int[] arr,int n){
        if(n == 1) return;

        for(int j = 0; j < n-1 ; j++){
            if(arr[j] > arr[j+1]){
                swap(arr,j,j+1);
            }
        }
        bubblesort(arr,n-1);

    }

    static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
