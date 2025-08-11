public class NumberExampleRecursion {
    public static void main(String[] args) {
//        print1(1);
        print(-1);
    }

    static void print1(int n) {
        System.out.print(n);
        if(n<5){
            print1(n+1);
        }
    }

    static void print(int n){
        System.out.println(n);
        if(n==5){
            return;
        }
        print(n+1);
    }

}
