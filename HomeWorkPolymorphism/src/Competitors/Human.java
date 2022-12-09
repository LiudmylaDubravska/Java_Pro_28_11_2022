package Competitors;

import Barrier.Barrier;

public class Human implements Competitor{
    @Override
    public void run() {
        System.out.printf("Human is running");
    }

    @Override
    public void jump() {
        System.out.printf("Human is jumping");
    }

    @Override
    public void overcome(Barrier barrier) {

    }
}
