package Competitors;

import Barrier.Barrier;

public class Cat implements Competitor{
    @Override
    public void run() {
        System.out.printf("Cat is running");
    }

    @Override
    public void jump() {
        System.out.printf("Cat is jumping");

    }

    @Override
    public void overcome(Barrier barrier) {

    }
}
