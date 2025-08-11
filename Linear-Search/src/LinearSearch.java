public class LinearSearch {

    public static void main(String[] args) {

        int[] arr ={12,-9 ,22, 12,34,55,678,900,54,-23,-324,43,2,-3};

        System.out.println("The target is present on index: "+linearsearch(arr,900));

    }

    static int linearsearch(int[] arr,int target){
        if(arr.length == 0){
            return -1 ;
        }

        for(int i=0 ; i<arr.length ; i++){
            if(target == arr[i]){
                return i ;
            }

        }

        // if target not found
        return -1;
    }
}
