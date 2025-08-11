import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Satyam Nagpure";

        //converting to char array by toCharArray()
        System.out.println(Arrays.toString(name.toCharArray()));

        // lowercase funtion
        System.out.println(name.toLowerCase());
        System.out.println(name);

        System.out.println(Arrays.toString(name.split("a")));




    }
}
