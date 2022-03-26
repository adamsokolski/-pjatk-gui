package cwiczenia.c03.ex01;

public class Square implements Comparable<Square>, Figure {
    protected int length;
    protected int number;
    static int counter = 1;

    public Square(int length) throws TooBigSquareException {
        if (length < max) {
            this.length = length;
            this.number = counter++;
        } else {
            throw new TooBigSquareException(max);
        }

    }

    public int getArea() {
        return length * length;
    }

    @Override
    public int getPerimeter() {
        return 4 * length;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "(" + this.number + "): " + this.getArea();
    }

    @Override
    public int compareTo(Square o) {
        return Integer.compare(this.length, o.length);
    }
}
