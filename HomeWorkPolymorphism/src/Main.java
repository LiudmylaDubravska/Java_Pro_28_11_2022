import Barrier.Barrier;
import Barrier.RunningTrack;
import Barrier.Wall;
import Competitors.Cat;
import Competitors.Competitor;
import Competitors.Human;
import Competitors.Robot;
import GeometricFigures.Circle;
import GeometricFigures.GeometricFigure;
import GeometricFigures.Square;
import GeometricFigures.Triangle;

public class Main {

    public static void main(String[] args) {
        GeometricFigure[] figures = {new Circle(3.8),
                new Square(4.0),
                new Triangle(2.1, 4.2)
        };

        System.out.println("Area of a circle = " + figures[0].area());
        System.out.println("Area of a square = " + figures[1].area());
        System.out.println("Area of a triangle = " + figures[2].area());

        summaryArea(figures);
        System.out.println("-------------------------------------------------------");

        Barrier[] barriers = {new RunningTrack(),
                new Wall()
        };

        Competitor[] competitors = {new Cat(), new Human(), new Robot()};

        for (int i=0; i<competitors.length; i++){

            for (int j=0; j < barriers.length; j++){
              //  competitors[i].overcome(barriers[j]);
                System.out.println();
                competitors[i].jump();
                barriers[j].overcome();
                System.out.println();
                competitors[i].run();
                barriers[j].overcome();
                System.out.println();
            }
        }
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
