package cwiczenia.c02.ex02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Spiewak {
    private String nazwisko;
    private static int liczbaSpiewakow = 1;
    private int numerStartowy = liczbaSpiewakow;

    public abstract String spiewaj();

    public Spiewak(String nazwisko) {
        this.nazwisko = nazwisko;
        this.liczbaSpiewakow++;
    }

    public static Spiewak najglosniej(Spiewak[] spiewacyArr) {
        Spiewak najglosniejszySpiewak = spiewacyArr[0];
        int najwiecejLiter = 0;

        for (Spiewak spiewak:spiewacyArr) {
            Pattern pattern = Pattern.compile("[A-Z]");
            String tekstSpiewu = spiewak.spiewaj();
            Matcher matcher = pattern.matcher(tekstSpiewu);

            // .results().count() https://www.baeldung.com/java-count-regex-matches
            int iloscDuzychLiter = (int) matcher.results().count();
            if (iloscDuzychLiter > najwiecejLiter) {
                najwiecejLiter = iloscDuzychLiter;
                najglosniejszySpiewak = spiewak;
            }
        }

        return najglosniejszySpiewak;
    }

    @Override
    public String toString() {
        return "(" + numerStartowy + ") " + nazwisko + ": " + this.spiewaj();
    }
}
