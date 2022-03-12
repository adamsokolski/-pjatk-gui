package wyklady.w1.model;

public class Square extends Figure {
    private double side;

    public Square(double side) {
        super(100, 250);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
