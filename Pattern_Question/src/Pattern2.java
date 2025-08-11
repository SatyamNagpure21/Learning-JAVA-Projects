public class Pattern2 {
    public static void main(String[] args) {

//        pattern4(4);
        int n = 5;

//        pattern6(n);
        pattern5(5);

    }

//  1
//  12
//  123
//  1234
    static void pattern4(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    //ternary operator answer = (if this) ? (run this) : (else run this);

    static void pattern5(int n){
        for (int row = 0; row < 2*n; row++) {
            int totalcolinrow = row > n ? 2*n-row :row;
            for (int col = 0; col < totalcolinrow; col++) {
                System.out.print("@ ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n){
        for (int i = 0; i < 2*n; i++) {
            if(i>n){
                for (int j = 0; j < 2*n-i; j++) {
                    System.out.print("$ ");
                }
                System.out.println();
            }
            else{
                for (int j = 0; j < i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

        }
    }
}
