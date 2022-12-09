package Barrier;

public class RunningTrack implements Barrier{
    private int length;

    public RunningTrack(int length) {
        this.length = length;
    }

    @Override
    public void overcome() {
        System.out.printf(" on a running track!");
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
