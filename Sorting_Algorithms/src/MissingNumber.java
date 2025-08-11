import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {4,0,2,1};
        System.out.println(missingNumber(arr)) ;

    }


    //kunal sir code
    static int missingNumber(int[] arr){
        int i=0;

        while(i < arr.length){

            // correct element will be element == index
            int correct = arr[i];

            // here arr[i] < arr.length means arr[i] cannot cross the N length of array
            // simply it will ignore the Nth value
            //this if will check the element == index and will ignore the Nth value element

            if(arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr,i,correct);
            }
            // if element == index is found then it will check the next element
            else{
                i++;
            }
        }

        // search for the missing number
        for (int index = 0; index < arr.length; index++) {

            if(arr[index] != index){
                return index;
            }
        }
        return arr.length;
    }

    static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
