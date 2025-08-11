import java.util.Scanner;

public class CalculatePower {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter base: ");int base = in.nextInt();
        System.out.print("Enter power: ");int power = in.nextInt();

        int ans = 1;
        while(power > 0){


            if((power & 1) == 1){
                ans = ans * base;
            }
            base *= base;
            power = power>>1;
        }

        System.out.println("Answer: "+ans);
    }
}
