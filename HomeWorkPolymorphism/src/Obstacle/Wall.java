package Obstacle;

import Competitors.Competitor;

public class Wall extends Obstacle{

    public Wall(double height) {
        super(height, 0);
    }

    @Override
    public void overcome(Competitor competitor) {
        if(competitor.getMaxHeight() >= height){
            competitor.jump();
        }else{
            competitor.lostJump();
        }
    }
}
