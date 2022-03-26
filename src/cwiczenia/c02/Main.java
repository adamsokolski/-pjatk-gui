package cwiczenia.c02;

public class Main {
    public static void main(String[] args) {

        Pojazd rower = new Pojazd() {
            @Override
            public void showTypPojazdu() {
                System.out.println("Rower");
            }
        };

        rower.showTypPojazdu();


    }
}
