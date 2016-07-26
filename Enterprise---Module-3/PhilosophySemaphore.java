package EnterpriseModule3;

/**
 * Created by ZahornyiAI on 26.07.2016.
 */
public class PhilosophySemaphore implements Semaphore {
    private int freePermits;
    private final Object lock = new Object();

    PhilosophySemaphore(int freePermits) {
        this.freePermits = freePermits;
    }
    @Override
    public void acquire() {
        synchronized (lock) {
            if (freePermits > 0) {
                freePermits--;
            } else {
                while (freePermits == 0) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                freePermits--;
                lock.notifyAll();
            }
        }
    }
    @Override
    public void acquire(int permits) {
        synchronized (lock) {
            if (freePermits >= permits) {
                freePermits -= permits;
            } else {
                while (freePermits < permits) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                freePermits -= permits;
                lock.notifyAll();
            }
        }
    }

    @Override
    public void release() {
        synchronized (lock) {
            freePermits++;
            lock.notifyAll();
        }
    }

    @Override
    public void release(int permits) {
        synchronized (lock) {
            freePermits += permits;
            lock.notifyAll();
        }
    }

    @Override
    public int getAvailablePermits() {
        return freePermits;
    }

}
