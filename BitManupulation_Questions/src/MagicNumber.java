public class MagicNumber {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(magic(n));

    }

    static int magic(int n){
        int ans = 0;
        int base = 5;

        while(n > 0){
            int last = n&1;
            ans += last*base;
            n = n>>1;
            base = base * 5;
        }
        return ans;
    }
}
