package wyklady.w0506.ex03;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<String> names = Stream.of("John", "Marry", "Olga", "Adam", "Jan", "Alice");
        names.filter(str -> {
                System.out.println("processing: " + str + " - " + str.startsWith("A"));
                return str.startsWith("A");
            }).forEach(System.out::println);
    }
}
