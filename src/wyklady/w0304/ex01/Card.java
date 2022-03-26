package wyklady.w0304.ex01;

public enum Card {
    TWO(2), THREE(3), FOUR(4), JACK(10), QUEEN(10), KING(11), ACE(12);

    private int value;

    private Card(int aValue) {
        this.value = aValue;
    }

    public int getValue() {
        return value;
    }
}
