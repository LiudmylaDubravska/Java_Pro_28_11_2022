package Competitors;

import Barrier.Barrier;

public interface Competitor {
    public boolean run();
    public boolean jump();
    public void overcome(Barrier barrier);
}
