import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = in.nextLine();

        if (checkPalindrome(s)){
            System.out.println("Its a Palindrome...");
        }
        else {
            System.out.println("Not a palindrome");
        }

    }

    static boolean checkPalindrome(String s){

//        if(s.length() == 0 || s == null){
//            return true;
//        }
        if(s.isEmpty()){
            return true;
        }

        for (int i = 0; i < s.length()/2; i++) {
            char start = s.charAt(i);
            char end = s.charAt(s.length()-1-i);
            if (start != end){
                return false;
            }
        }
        return true;
    }

}
