package Obstacle;

import Competitors.Competitor;

public class RunningTrack extends Obstacle{
    public RunningTrack(double length) {
        super(0, length);
    }
    @Override
    public void overcome(Competitor competitor) {
        if(competitor.getMaxLength() >= length){
            competitor.run();
        } else{
            competitor.lostRun();
        }
    }
}
