public class SetBits {
    public static void main(String[] args) {
        int n = 4554161;

        System.out.println(Integer.toBinaryString(n));

        System.out.println(setbits(n));


    }

    static int setbits(int n){
        int count = 0 ;

        while(n>0){
            n = n - (n&(-n));  // you can also write n -= (n&(n-1))
            count++;
        }
        return count;
    }
}
