package introduction;

import java.util.Arrays;

public class Main {
    public void main(String[] args) {
        int[] number = new int[5];  // store 5 roll numbers

        String[] names = new String[5];

        //data of 5 students
        int[] rnos = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        // we can store all the above like
        Student[] students = new Student[5];

        Student student1;
        student1 = new Student();

        System.out.println(student1.name);

//        System.out.println(Arrays.toString(students));


    }

    // create a class
    class Student {
        int rnos;
        String name;
        float marks;
    }

}
