package cwiczenia.p01;

public enum Certificates {
    // Certifications from https://en.wikipedia.org/wiki/Intermodal_container#Types
    // TODO: Add couple more
    DNV("DNV2,7-1", "Det Norske Veritas"),
    LRCCS("LRCCS", "Lloyd's Register"),
    GCOC("Certification of Offshore Containers", "American Bureau of Shipping");


    private String[] certification = new String[2];
    Certificates(String certificationName, String registrarName) {
        this.certification[0] = certificationName;
        this.certification[1] = registrarName;
    }

    public String getName() {
        return this.certification[0];
    }

    public String getRegistrar() {
        return this.certification[1];
    }

    public String getFullName() {
        return this.certification[0] + " by " + this.certification[1];
    }
}
