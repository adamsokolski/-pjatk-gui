package wyklady.w0304.ex01;

public class Main {
    public static void main(String[] args) {
        System.out.println(Suit.HEARTS);

        System.out.println(Card.JACK);
        System.out.println(Card.JACK.getValue());

        fun(Card.FOUR, Suit.DIAMONDS);
    }

    public static void fun(Card card, Suit suit) {
        System.out.println(card.getValue() + " of " + suit);
    }
}
