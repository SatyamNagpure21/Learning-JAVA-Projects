import java.util.Arrays;

public class DemoOutput {
    public static void main(String[] args) {


        //here println() is overloading in 1st its taking int, in 2nd its taking string int 3rd its taking object
        System.out.println(56);
        System.out.println("Satyam");
        System.out.println(new int[]{1,2,3,4,5,5});

        System.out.println(Arrays.toString(new int[]{2,3,4,5,66,4}));


        //wrapper class
        Integer num = new Integer(56);
        System.out.println(num.toString());


    }
}
