package GeometricFigures;

import java.lang.Math;

public class Circle implements GeometricFigure{
    double radius;

    @Override
    public double area() {
        double circleArea = radius * radius + Math.PI;
        return circleArea;
    }

    public Circle(double radius) {
        this.radius = radius;
    }
}
