public class BS {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,11,122,333};

        int target = 23;
        System.out.println(bsearch(arr,target,0,arr.length-1));

    }
     // Binary Search using Recursion
    // Divide and conquer recurence relation
    static int bsearch(int[] arr,int target,int start,int end){

        if(start > end){
            return -1;
        }

        int m = start + (end-start)/2 ;

        if(target == arr[m]){
            return m;
        }

        if(target < arr[m]){
            return bsearch(arr,target,start,m-1);
        }
        else{
            return bsearch(arr,target,m+1,end);
        }
    }
}
