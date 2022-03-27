package cwiczenia.p01;

public class Ship {
    private String shipName;
    private String homePort;
    private String startLocation;
    private String endLocation;
    private String shipId;
    private int maxDangerousContainers;
    private int maxHeavyContainers;
    private int maxElectricityContainers;
    private int maxContainers;
    private int maxPayloadWeight;
    static public int counter;

    public Ship(String shipName, String homePort, String startLocation, String endLocation, int maxDangerousContainers, int maxHeavyContainers, int maxElectricityContainers, int maxContainers, int maxPayloadWeight) {
        this.shipName = shipName;
        this.homePort = homePort;
        this.startLocation = startLocation;
        this.endLocation = endLocation;
        this.maxDangerousContainers = maxDangerousContainers;
        this.maxHeavyContainers = maxHeavyContainers;
        this.maxElectricityContainers = maxElectricityContainers;
        this.maxContainers = maxContainers;
        this.maxPayloadWeight = maxPayloadWeight;
        this.shipId = "S-" + ++counter;
    }

    @Override
    public String toString() {
        return shipName + "(" + shipId + "): ";
    }
}
