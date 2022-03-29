package cwiczenia.c04;

public class Samochod {
    private String nrRejestracyjny;
    public Marka marka;

    public Samochod(String nrRejestracyjny, Marka marka) {
        this.nrRejestracyjny = nrRejestracyjny;
        this.marka = marka;
    }

    @Override
    public String toString() {
        return marka.name + " " + this.nrRejestracyjny;
    }
}
