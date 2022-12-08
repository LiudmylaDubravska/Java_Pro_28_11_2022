package GeometricFigures;

public class Square implements GeometricFigure{
    double side;
    @Override
    public double area() {
        double squareArea = side * side;
        return squareArea;
    }

    public Square(double side) {
        this.side = side;
    }
}
