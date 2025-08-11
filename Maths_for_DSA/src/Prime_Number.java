import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = in.nextInt();

        System.out.println("The number "+n+" is prime : "+prime(n));



    }

    static boolean prime(int n){
        int c = 2;
        if(n<=1){
            return false;
        }

        while(c * c <= n){
            if(n % c == 0){
                return false;
            }
            c++;
        }
        return true;
        
    }

    // not optimized code
    static void findprime(int n){
        int c = 2;
        if(n<c){
            System.out.println("Niether prime nor Composite");
        }

        boolean isPrime = true;
        while(c < n){
            if(n % c == 0){
                isPrime = false;
                break;
            }
            c++;
        }

        if (isPrime){
            System.out.println("Its a prime number.");
        }
        else{
            System.out.println("Not a prime number.");
        }


    }
}
