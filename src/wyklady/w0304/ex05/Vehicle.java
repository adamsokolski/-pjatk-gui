package wyklady.w0304.ex05;

public interface Vehicle {
    void move();
    boolean engineCheckTime();
    default void startEngine() {
        if(engineCheckTime()) {
            System.out.println("⚠ Silnik wymaga przegladu.");
        }
    }

    static int getHorsePower(int rmp, int torque) {
        return (rmp * torque) / 10000;
    }

}
