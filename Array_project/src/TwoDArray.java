import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
//        int[][] a = {
//                {23, 23, 21},
//                {45, 32, 43},
//                {32, 21, 12}
//        };

        int[][] b = {
                {1,2,3,4},
                {2,3,4,5,6,7,8,9,0,2},
                {1,2}};

        // how to print b
        for(int i=0 ; i<b.length ; i++){
            // print variable size of rows b[row].length
            for (int j=0 ; j<b[i].length ; j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }

        int[][] s = new int[3][3];
        Scanner in = new Scanner(System.in);

        //array input

        for(int i=0 ; i< s.length ; i++ ){
            // now for column
            for(int j=0 ; j< s[i].length ; j++){
                System.out.print("s["+i+"]["+j+"] : ");
                s[i][j] = in.nextInt();
            }
        }

//        for(int i=0 ; i< s.length ; i++ ){
//            // now for column
//            for(int j=0 ; j< s[i].length ; j++){
//                System.out.print("s["+(i+1)+"]["+(j+1)+"] : ");
//                s[i][j] = in.nextInt();
//            }
//        }

        //print ing the array
        for(int i=0 ; i< s.length ; i++ ){
            // now for column
            for(int j=0 ; j< s[i].length ; j++){
                System.out.print(s[i][j]+" ");
            }
            System.out.println();
        }

        // printing array better method
        for (int i = 0; i < s.length ; i++) {
            System.out.println(Arrays.toString(s[i]));
        }
        System.out.println();


//        System.out.println("output with enhanced for loop: \n"        );

        for(int[] a : s){
            System.out.println(Arrays.toString(a));
        }





    }
}
