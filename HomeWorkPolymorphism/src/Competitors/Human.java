package Competitors;

import Barrier.Barrier;
import Barrier.RunningTrack;
import Barrier.Wall;
public class Human implements Competitor{
    public int maxLength = 5000;
    public int maxHeigth = 3;
    public RunningTrack runningTrack;
    public Wall wall;
    @Override
    public boolean run() {
        int length = runningTrack.getLength();
        System.out.printf("Human is running " + length + " meters");
        if (length > maxLength) {
            return false;
        } else return true;
    }

    @Override
    public boolean jump() {
        int height = wall.getHeight();
        System.out.printf("Human is jumping "+ height + " meters");
        if (height > maxHeigth) {
            return false;
        } else return true;
    }

    @Override
    public void overcome(Barrier barrier) {

    }

    public Human(int maxLength, int maxHeigth, RunningTrack runningTrack, Wall wall) {
        this.maxLength = maxLength;
        this.maxHeigth = maxHeigth;
        this.runningTrack = runningTrack;
        this.wall = wall;
    }
}
