package cwiczenia.p01;

public class Container {
    private String containerId;
    private String sender;
    private Security security;
    private Certificates certificates;
    private double tareWeight;
    private double netWeight;
    private double grossWeight;
    private int counter;

    public Container(String sender, Security security, Certificates certificates, double tareWeight, double netWeight, double grossWeight) {
        this.sender = sender;
        this.security = security;
        this.certificates = certificates;
        this.tareWeight = tareWeight;
        this.netWeight = netWeight;
        this.grossWeight = grossWeight;
        this.containerId = "C-" + ++counter;
    }
}
