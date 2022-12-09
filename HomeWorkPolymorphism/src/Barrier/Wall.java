package Barrier;

public class Wall implements Barrier{
    private int height;

    public Wall(int height) {
        this.height = height;
    }
    @Override
    public void overcome() {
        System.out.printf(" through the wall!");
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


}
