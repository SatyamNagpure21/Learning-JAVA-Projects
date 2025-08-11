import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(5);

//        list.add(23);
//        list.add(43);
//        list.add(23);
//        list.add(43);
//
//        System.out.println(list);
//        System.out.println(list.contains(23));
//
//        list.set(1,554);
//        System.out.println(list);


        for(int i=0 ; i<5 ;i++){
            System.out.print("Enter "+i+" num: ");
            list.add(in.nextInt());
        }

        System.out.println(list);
        System.out.println("list.get(3): "+list.get(3));


    }
}
