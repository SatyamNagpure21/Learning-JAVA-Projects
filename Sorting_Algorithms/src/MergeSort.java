import java.util.ArrayList;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = in.nextInt();
        int[] arr = new int[n];

        //take input in the array
        System.out.print("Enter your array: ");
        for(int i = 0; i<arr.length ;i++){
            arr[i] = in.nextInt();
        }

        mergesort(arr,0,n-1);

        //Print the sorted array
        System.out.print("Sorted array: ");
        for(int num : arr){
            System.out.print(num+" ");
        }

    }

    static void mergesort(int[] arr,int low ,int high){

        if(low >= high) return;

        int mid = low + (high-low)/2;
        mergesort(arr,low,mid);
        mergesort(arr,mid+1,high);
        merge(arr,low, mid, high);

    }

    static void merge(int[] arr,int low, int mid,int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;

        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left++]);
            }
            else {
                temp.add(arr[right++]);
            }
        }
        while(left <= mid){
            temp.add(arr[left++]);
        }
        while(right <= high){
            temp.add(arr[right++]);
        }
        // copy all the elements from temp to arr
        for(int i = 0; i<temp.size() ; i++){
            arr[low+i] = temp.get(i);
        }
    }




}
