import java.util.Arrays;

public class Changing {
    public static void main(String[] args) {
        int[] arr = { 1, 1,2 ,3 ,132,1 , 2, 32 } ;
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void change(int[] arr) {
        arr[1] = 34 ;
    }
}
