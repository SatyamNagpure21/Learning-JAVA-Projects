import java.util.Scanner;

public class PowofTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        System.out.println("The entered number is power of 2: " + powof2(n));


    }

    static boolean powof2(int n){
        return ((n&(n-1)) == 0);
    }
}
