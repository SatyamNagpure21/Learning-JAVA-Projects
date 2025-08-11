public class Print_prime_nos {
    // bro called it Sieve of Eratosthenes
    public static void main(String[] args) {
        int n = 40;
        boolean[] notprimes = new boolean[n+1];
        sieve(n,notprimes);
    }

    static void sieve(int n,boolean[] notprimes ){
        for (int i = 2; i * i <= n ; i++) {
            if(!notprimes[i]){
                for (int j = i*2; j <= n ; j+=i) {
                    notprimes[j] = true;
                }
            }
        }
        for(int i = 2; i <= n; i++ ){
            if(!notprimes[i]){
                System.out.print(i + " ");
            }
        }
    }
}
