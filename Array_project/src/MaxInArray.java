public class MaxInArray {
    public static void main(String[] args) {

        int[] arr = {21,2,3,4,4,32,-1};
        System.out.println("MAX value in the array: "+max(arr));
        System.out.println("Max value in range 1 to 4: "+maxinRange(arr,1,4));

    }

    static int max(int[] arr){
        int max = Integer.MIN_VALUE;

        for(int i=0 ; i<arr.length ; i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    static int maxinRange(int[] arr,int start,int end){
        int max = arr[start];
        for(int i=start; i<end; i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
//for(int i=0 ; i<arr.length ; i++){
//        if( max < arr[i]){
//              max = arr[i];
//        }
// }
