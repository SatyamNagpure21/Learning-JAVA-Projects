import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = in.nextInt();
        System.out.println("The number is ODD: " + evenodd(n));
    }

    static boolean evenodd(int n){
        return (n & 1) == 1;
    }
}
