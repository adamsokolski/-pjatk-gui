package cwiczenia.c02;

public abstract class Pojazd {
    private String nazwa;

    public abstract void showTypPojazdu();

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
}
