package wyklady.w02;

import wyklady.w02.model.*;
import wyklady.w02.struct.MyList;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Sylvia", 36, "s0678");
        Student s2 = new Student("Philipa", 48, "s0024");
        Student s3 = new Student("Adam", 21, "s0042");

        Student[] students = {
            s1, s2, s3
        };

        for (Student s : students)
            System.out.println(s);

        System.out.println("--------------------");

        Arrays.sort(students);

        for (Student s : students)
            System.out.println(s);


        System.out.println("--------------------");


        MyList<Student> studentList = new MyList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        studentList.show();
    }
}
