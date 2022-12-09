package Competitors;

import Barrier.Barrier;
import Barrier.RunningTrack;
import Barrier.Wall;
public class Robot implements Competitor{
    public int maxLength = 3;
    public int maxHeigth = 1;
    public RunningTrack runningTrack;
    public Wall wall;
    @Override
    public boolean run() {
        int length = runningTrack.getLength();
        System.out.printf("Robot is running " + length + " meters");
        if (length > maxLength) {
            return false;
        } else return true;
    }

    @Override
    public boolean jump() {
        int height = wall.getHeight();
        System.out.printf("Robot is jumping "+ height + " meters");
        if (height > maxHeigth) {
            return false;
        } else return true;
    }

    @Override
    public void overcome(Barrier barrier) {

    }

    public Robot(int maxLength, int maxHeigth, RunningTrack runningTrack, Wall wall) {
        this.maxLength = maxLength;
        this.maxHeigth = maxHeigth;
        this.runningTrack = runningTrack;
        this.wall = wall;
    }
}
