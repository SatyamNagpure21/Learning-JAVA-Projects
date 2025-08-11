public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int correct = nums[i] - 1;
            if(nums[i] > 0 && nums[correct] != nums[i]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }

        for(int index = 0; index<nums.length; index++){
            if (nums[index] != index+1) {
                return index+1;
            }
        }
        return nums.length+1;
    }

    void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


}
