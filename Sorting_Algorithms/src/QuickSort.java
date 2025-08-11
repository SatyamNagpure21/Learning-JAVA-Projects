public class QuickSort {
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        int n = arr.length;

        quicksort(arr,0,n-1);

        // print sorted array
        for(int num : arr){
            System.out.print(num + " ");
        }

    }

    static void quicksort(int[] arr ,int low ,int high){
        if(low < high){
            int pindex = findp(arr,low,high);
            quicksort(arr,low,pindex-1);
            quicksort(arr,pindex+1,high);

        }
    }


    static int findp(int[] arr,int low,int high){
        int pivot = arr[low];
        int i = low;     // low
        int j = high;    // high

        while( i < j ){
            while(i<= high && arr[i] <= pivot){
                i++;
            }
            while(j >= low && arr[j] > pivot){
                j--;
            }
            if(i<j){
                swap(arr,i,j);
            }
        }
        swap(arr,j,low);
        return j;

    }

    static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
