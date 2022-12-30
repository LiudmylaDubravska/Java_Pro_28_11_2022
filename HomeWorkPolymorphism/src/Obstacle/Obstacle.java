package Obstacle;

import Competitors.Competitor;

public abstract class Obstacle {
    double height;
    double length;
    public abstract boolean overcome(Competitor competitor);

    public Obstacle(double height, double length) {
        this.height = height;
        this.length = length;
    }
}
