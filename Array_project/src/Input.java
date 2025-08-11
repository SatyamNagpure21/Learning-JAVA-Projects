import java.util.Arrays ;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        int[] a = new int[7];
        System.out.println("Enter 7 numbers: ");
        for(int i=0 ; i < a.length ; i++){
            a[i] = in.nextInt();
        }
//        for(int i=0 ; i < a.length ; i++){
//            System.out.print(a[i]+" ");
//        }
        System.out.println(Arrays.toString(a));

    }
}
