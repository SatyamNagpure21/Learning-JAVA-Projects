import java.util.Scanner;

public class for_lloop {
    public static void main(String[] args) {
//        int arr[] = {1,2,3,4,5};
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }

        Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();
        double d = scan.nextInt();
        String s = scan.nextLine();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
