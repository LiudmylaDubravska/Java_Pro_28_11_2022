import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class PetrolStation {
    double amount;
    ReentrantLock lock1 = new ReentrantLock();
    ReentrantLock lock2 = new ReentrantLock();
    ReentrantLock lock3 = new ReentrantLock();

    public PetrolStation(double amount) {
        this.amount = amount;
    }

    public boolean doRefuel(double refuelAmount){
        ReentrantLock lockColumn = tryLockColumn();
        if (lockColumn != null) {
            try {
                int seconds = ThreadLocalRandom.current().nextInt(3, 10);
                System.out.println("Waiting " + seconds + " seconds for refuelling " + refuelAmount +" litters...");
                TimeUnit.SECONDS.sleep(seconds);
                subtractAmount(refuelAmount);
                return true;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lockColumn.unlock();
            }
        }
        return false;
    }

    private ReentrantLock tryLockColumn() {
        boolean isLockRequired = lock1.tryLock();
        if (isLockRequired) {
            return lock1;
        }
        isLockRequired = lock2.tryLock();
        if (isLockRequired) {
            return lock2;
        }
        isLockRequired = lock3.tryLock();
        if (isLockRequired) {
            return lock3;
        }
        return null;
    }

    private synchronized boolean subtractAmount(double refuelAmount) {

        if (amount >= refuelAmount) {
            amount -= refuelAmount;
            return true;
        }
        return false;
    }


}
