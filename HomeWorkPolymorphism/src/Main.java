import GeometricFigures.Circle;
import GeometricFigures.GeometricFigure;
import GeometricFigures.Square;
import GeometricFigures.Triangle;

public class Main {

    public static void main(String[] args) {
        double area=0.0;
        GeometricFigure[] figures = {new Circle(3.8),
                new Square(4.0),
                new Triangle(2.1, 4.2)
        };

        System.out.println("Area of a circle = " + figures[0].area());
        System.out.println("Area of a square = " + figures[1].area());
        System.out.println("Area of a triangle = " + figures[2].area());

        summaryArea(figures);
        System.out.println("-------------------------------------------------------");
    }

    static void summaryArea(GeometricFigure[] figures) {
        double area = 0.0;
        for (int i = 0; i < figures.length; i++) {
            area = figures[i].area() + area;
        }
        System.out.println("Summary = " + area);
    }
}
