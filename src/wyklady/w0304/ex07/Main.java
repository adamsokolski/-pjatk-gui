package wyklady.w0304.ex07;

import wyklady.w02.model.Student;
import wyklady.w0304.ex07.struct.MyList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

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


        System.out.println("-----1-----");


        Arrays.sort(students);

        for (Student s : students)
            System.out.println(s);


        System.out.println("-----2-----");


        MyList<Student> studentList = new MyList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        studentList.show();

        for(Student student : studentList)
            System.out.println("MyList: " + student);

        System.out.println("-----3-----");


        LinkedList<Student> studentLinkedList = new LinkedList<>();
        studentLinkedList.add(s1);
        studentLinkedList.add(s2);
        studentLinkedList.add(s3);

        for(Student student : studentLinkedList)
            System.out.println(student);


        System.out.println("-----4-----");


        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(s1);
        studentArrayList.add(s2);
        studentArrayList.add(s3);

        HashMap<Integer, Student> hashMap = new HashMap<>();
        hashMap.put(s1.getAge(), s1);
        hashMap.put(s2.getAge(), s2);
        hashMap.put(s3.getAge(), s3);

        System.out.println(
            hashMap.get(21)
        );
    }

}
