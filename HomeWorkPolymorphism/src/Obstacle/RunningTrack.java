package Obstacle;

import Competitors.Competitor;

public class RunningTrack extends Obstacle{
    public RunningTrack(double length) {
        super(0, length);
    }
    @Override
    public boolean overcome(Competitor competitor) {
        boolean isLost=false;
        if(competitor.getMaxLength() >= length){
            competitor.run();
        } else{
            competitor.lostRun();
            isLost = true;
        }
        return isLost;
    }
}
