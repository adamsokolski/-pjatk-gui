package cwiczenia.c03.ex01;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws TooBigSquareException {
        Square square1 = new Square(4);
        Square square2 = new Square(1);
        Square square3 = new Square(3);
        Square square4 = new Square(2);
        Square square5 = new Square(5);

        Square[] squares = {square1, square2, square3, square4, square5};

        System.out.println("--- Before sorting ---\n");

        for(Square square : squares) {
            System.out.println(square);
        }

        System.out.println("\n--- After sorting ---\n");

        Arrays.sort(squares);

        for(Square square : squares) {
            System.out.println(square);
        }

    }
}
