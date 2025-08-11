public class pattern3 {
    public static void main(String[] args) {
        pattern(5);

    }

    static void pattern(int n){
        for (int i = 0; i < 2*n-1; i++) {
            if(i<n){
                for (int space = n - i; space > 0; space--) {
                    System.out.print(" ");
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            else{
                for (int space = 0; space < i; space++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < n-i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
