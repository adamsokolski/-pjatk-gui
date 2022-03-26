package cwiczenia.c03;

@FunctionalInterface
public interface Show {
    int a = 3;

    default void showText(String text) {
        System.out.println(text);
    }

    void showHelloWithText(String text);
}
