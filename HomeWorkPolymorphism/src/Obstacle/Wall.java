package Obstacle;

import Competitors.Competitor;

public class Wall extends Obstacle{

    public Wall(double height) {
        super(height, 0);
    }

    @Override
    public boolean overcome(Competitor competitor) {
        boolean isLost=false;
        if(competitor.getMaxHeight() >= height){
            competitor.jump();
        }else{
            competitor.lostJump();
            isLost=true;
        }
        return isLost;
    }
}
