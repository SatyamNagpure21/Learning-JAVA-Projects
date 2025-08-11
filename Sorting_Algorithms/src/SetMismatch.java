public class SetMismatch {
    public int[] findErrorNums(int[] arr) {
        int i = 0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[correct] != arr[i]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }

        //to search in the array and fill ans in the array
        // int[] ans = {0,0};
        for(int index = 0; index < arr.length; index++){
            if(arr[index] != index+1){
                return new int[]{arr[index],index+1};
            }
        }
        return new int[]{-1,-1};

    }

    void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
