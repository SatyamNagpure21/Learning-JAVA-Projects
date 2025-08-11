import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllMissingNumbers {
//    public static void main(String[] args) {
//        int[] arr = {4,3,2,7,8,2,3,1};
//       cyclic(arr);
//        int[] ans = {};
//
//        //search the element which is not present by checking arr[correct] == arr[i]
//
//
//    }

    public List<Integer> findDisappearedNumbers(int[] nums){
        int i = 0;
        while(i<nums.length){
            int correct = nums[i] - 1;    // this is the correct index of all the numbers
            if(nums[i] != nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }

        //just find the missing numbers
        List<Integer> ans = new ArrayList<>();

        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index+1){
                ans.add(index+1);
            }
        }
        return ans;
    }


    void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
