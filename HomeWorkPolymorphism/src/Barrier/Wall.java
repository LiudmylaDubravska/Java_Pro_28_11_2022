package Barrier;

public class Wall implements Barrier{

    public Wall() {

    }

    @Override
    public void overcome() {
        System.out.printf(" through a wall!");
    }
}
