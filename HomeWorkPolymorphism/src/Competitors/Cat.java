package Competitors;

import Barrier.Barrier;
import Barrier.RunningTrack;
import Barrier.Wall;

public class Cat implements Competitor{
    public int maxLength = 4000;
    public int maxHeight = 4;
    public RunningTrack runningTrack;
    public Wall wall;

    @Override
    public boolean run() {
       int length = runningTrack.getLength();
        System.out.printf("Cat is running " + length + " meters");
        if (length > maxLength) {
            return false;
        } else return true;
    }

    @Override
    public boolean jump() {
        int height = wall.getHeight();
        System.out.printf("Cat is jumping "+ height + " meters");
        if (height > maxHeight) {
            return false;
        } else return true;
    }

    @Override
    public void overcome(Barrier barrier) {

    }

    public Cat(int maxLength, int maxHeight, RunningTrack runningTrack, Wall wall) {
        this.maxLength = maxLength;
        this.maxHeight = maxHeight;
        this.runningTrack = runningTrack;
        this.wall = wall;
    }
}
