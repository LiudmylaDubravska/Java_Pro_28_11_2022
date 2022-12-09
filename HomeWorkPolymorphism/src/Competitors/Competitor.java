package Competitors;

import Barrier.Barrier;

public interface Competitor {
    public void run();
    public void jump();
    public void overcome(Barrier barrier);
}
