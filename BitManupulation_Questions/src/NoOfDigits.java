public class NoOfDigits {
    // this code is to find the number of digits in the base b
    public static void main(String[] args) {
        int n = 6;
        int b = 2;

        // number of digits in base b of number n

        int ans = (int)(Math.log(n) / Math.log(b))+1;

        System.out.println(ans);

    }

}
