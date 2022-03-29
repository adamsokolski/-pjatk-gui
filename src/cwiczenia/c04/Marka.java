package cwiczenia.c04;

public enum Marka {
    SKODA("SKODA"),
    MAZDA("MAZDA"),
    BMW("BMW"),
    VOLVO("VOLVO");

    String name;
    Marka(String name) {
        this.name = name;
    }
}
