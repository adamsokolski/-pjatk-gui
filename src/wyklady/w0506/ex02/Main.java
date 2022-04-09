package wyklady.w0506.ex02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream.of("John", "Marry", "Olga", "Adam", "Jan", "Alice")
                .forEach(str -> System.out.println(str));


        System.out.println("\n-----1-----\n");


        Arrays.asList("a1", "a2", "b3", "b4", "c5", "c6")
                .forEach(System.out::println);


        Stream<String> names = Stream.of("John", "Marry", "Olga", "Adam", "Jan", "Alice");
        List<String> strings = Arrays.asList("a1", "a2", "b3", "b4", "c5", "c6");


        System.out.println("\n-----2-----\n");


        Stream.generate(Math::random)
                .limit(2)
                .forEach(System.out::println);


        System.out.println("\n-----3-----\n");


        Stream.iterate(1, element -> element + 1)
                .limit(10)
                .forEach(System.out::println);
    }
}
