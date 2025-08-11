import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {

        System.out.println('a' + 'b');
        System.out.print("value of b: ");
        System.out.println('b'+1-1);

        System.out.println("a" + "b");

        System.out.println((char)('a'+3));

        System.out.println("a"+1);
        // here integer will convert to Integer(Wrapper class) that will call toString()
        // this si same as after few step "a" + "1"

        System.out.println("Satyam" + new ArrayList<>());
        System.out.println("Satyam" + new Integer(21));

        System.out.println(new ArrayList<>()+""+ new Integer(56));



    }
}
