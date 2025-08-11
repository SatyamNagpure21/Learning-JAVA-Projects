import java.util.Scanner;


public class Pattern1 {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter the number of rows: ");
//        int n = in.nextInt();

//        pattern1(n);

//        pattern2(n);

          pattern2(4);
    }

    //x
    //x x
    //x x x
    //x x x x
    static void pattern1(int n){
        for (int i = 0; i < n; i++) {
            for (int j=0; j <= i; j++){
                System.out.print("x ");
            }
            System.out.println();
        }
    }

//  * * * *
//  * * * *
//  * * * *
//  * * * *
    static void pattern2(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j<n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//  * * * *
//  * * *
//  * *
//  *
    static void pattern3(int n){
        for (int i = 0; i < n; i++) {
            for (int j = n-i; j>0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
