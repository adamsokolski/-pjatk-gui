package wyklady.w0304.ex03;

public interface Vehicle {
    void move();
    boolean engineCheckTime();
    default void startEngine() {
        if(engineCheckTime()) {
            System.out.println("⚠ Silnik wymaga przegladu.");
        }
    }

}
