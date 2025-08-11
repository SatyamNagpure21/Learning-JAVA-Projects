public class Main{
    public static void main(String args[]){

        
        int a =2;
        int b=3;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("Value of A: "+a);
        System.out.println("Value of B: "+b);
    
    } 

}