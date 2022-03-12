package wyklady.w1.model;

public abstract class Figure {

    protected int centerX, centerY;

    public Figure(int centerX, int centerY) {
        this.centerX = centerX;
        this.centerY = centerY;
    }

    public abstract double getArea();
}
