public class Findunique2 {
    public static void main(String[] args) {
        int[] arr = {-2,3,2,4,-5,5,-4};
        System.out.println(ans(arr));
    }

    static int ans(int[] arr){
        int unique = 0;
        for(int n : arr){
            unique += n;
        }
        return unique;
    }

}
