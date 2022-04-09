package wyklady.w0506.ex04;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("a1", "a2", "b3", "b4", "c5", "c6");
        strings
            .stream()
            .map(str -> str.substring(1))
            .mapToInt(Integer::parseInt)
            .average()
            .ifPresent(System.out::println);
    }
}
