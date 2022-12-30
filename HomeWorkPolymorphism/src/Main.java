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

        Human human = new Human(2000, 2, "Oleh");
        Cat cat = new Cat(1000, 3, "Barsik");
        Robot robot = new Robot(3,1, "K325");
        Wall wall = new Wall(2);
        RunningTrack runningTrack = new RunningTrack(1001);
        Obstacle obstacles[] = new Obstacle[]{wall, runningTrack};
        Competitor competitors[] = new Competitor[]{human, cat, robot};

        boolean pass = true;
       for(Competitor competitor : competitors){
           for(Obstacle obstacle : obstacles){
               if(obstacle.overcome(competitor)){
                   break;
               };
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
