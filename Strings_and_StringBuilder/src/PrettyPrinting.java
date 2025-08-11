public class PrettyPrinting {
    public static void main(String[] args) {

        float a = 453.4565f;
        System.out.printf("%.2f", a);

        System.out.printf("%.2f \n", a); // prints 'a' with 2 decimal places


        // for formatted string we have to use printf() not println()

        System.out.printf("Pie : %.3f",Math.PI);

    }
}
