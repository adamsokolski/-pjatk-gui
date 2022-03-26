package wyklady.w0304.ex05;

public class Car implements Vehicle {
    private int distance;

    public Car() {
        this.distance = 0;

    }

    @Override
    public void move() {
        distance++;
    }

    @Override
    public boolean engineCheckTime() {
        return distance >= 10000;
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.startEngine();
        for (int i = 0; i < 10001; i++) {
            car.move();
        }

        car.startEngine();
    }
}
