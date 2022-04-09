package wyklady.w0506.ex05;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String[][] dataArray = new String[][] {
                {"a", "b"},
                {"c", "d"},
                {"e", "f"}
        };

        Arrays.stream(dataArray)
                .flatMap(arr -> Arrays.stream(arr))
                .forEach(System.out::println);

        List<String> flatArray = Arrays.stream(dataArray)
                .flatMap(arr -> Arrays.stream(arr))
                .collect(Collectors.toList());
    }
}
