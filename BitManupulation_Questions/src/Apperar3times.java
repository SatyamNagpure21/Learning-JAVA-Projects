public class Apperar3times {
    public static void main(String[] args) {
        int[] arr = {-1,-1,-1,4,5,6,8,9,5,5,6,9,6,9,8,8};

        System.out.println(find(arr));

    }


    static int find(int[] nums) {
        int result = 0;

        for (int i = 0; i < 32; i++) {
            int bitSum = 0;
            for (int num : nums) {
                if (((num >> i)& 1) == 1) {
                    bitSum++;
                }
            }
            if (bitSum % 3 != 0) {
                result |= (1 << i);
            }
        }

//        // handle negative numbers
//        if (result >= (1 << 31)) {
//            result -= (1 << 32);
//        }

        return result;
    }
}
