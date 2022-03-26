package cwiczenia.c03.ex01;

public class TooBigSquareException extends Exception {
    public TooBigSquareException(int max) {
        super("TooBigSquareException: Maximum value is " + max);
    }
}
