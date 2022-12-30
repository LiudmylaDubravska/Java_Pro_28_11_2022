import Obstacle.Obstacle;
import Obstacle.RunningTrack;
import Obstacle.Wall;
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

     /*   Obstacle[] barriers = {new RunningTrack(5000),
                new Wall(3)
        };

        Competitor[] competitors = {new Cat(4000, 4, new RunningTrack(5000), new Wall(3)),
                new Human(5000, 3, new RunningTrack(5000), new Wall(3)),
                new Robot(10, 1, new RunningTrack(5000), new Wall(3))};

        boolean pass = true;
        for(int i =0; i < competitors.length; i++){
            System.out.println();
            pass = competitors[i].run();
            barriers[0].overcome();
            if(pass){
                competitors[i].jump();
                barriers[1].overcome();
                System.out.println();
            }else {
                System.out.println();
                System.out.println("Competitor lost!!! " );
            }

        }*/
        Human human = new Human(2000, 2, "Oleh");
        Cat cat = new Cat(1000, 3, "Barsik");
        Robot robot = new Robot(3,1, "K325");
        Wall wall = new Wall(2);
        RunningTrack runningTrack = new RunningTrack(1000);
        Obstacle obstacles[] = new Obstacle[]{wall, runningTrack};
        Competitor competitors[] = new Competitor[]{human, cat, robot};

        boolean pass = true;
       for(Competitor competitor : competitors){
           for(Obstacle obstacle : obstacles){
               obstacle.overcome(competitor);
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
