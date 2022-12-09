package Competitors;

import Barrier.Barrier;

public class Robot implements Competitor{
    @Override
    public void run() {
        System.out.printf("Robot is running");
    }

    @Override
    public void jump() {
        System.out.printf("Robot is jumping");
    }

    @Override
    public void overcome(Barrier barrier) {

    }
}
