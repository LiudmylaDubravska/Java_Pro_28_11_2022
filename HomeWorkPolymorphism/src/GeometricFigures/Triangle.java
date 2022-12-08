package GeometricFigures;

public class Triangle implements GeometricFigure{
    double base;
    double height;
    @Override
    public double area() {
        double triangleArea = (base * height)/2;
        return triangleArea;
    }

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
}
