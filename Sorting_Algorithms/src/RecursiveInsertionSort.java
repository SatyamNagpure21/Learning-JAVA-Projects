public class RecursiveInsertionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int n = 5;

        //Recursive Insertion Sort
        insertion(arr,n);

        //Print the sorted array
        for(int num : arr){
            System.out.print(num + " ");
        }

    }

    static void insertion(int[] arr,int n){

        // if we have 1 element in the array is sort
        if(n <= 1) return;

        // recursive call to sort n-1 elements
        insertion(arr,n-1);

        for(int j = n-1 ; j>0 && arr[j-1] > arr[j] ; j--){
            swap(arr,j-1,j);
        }
    }

    static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
