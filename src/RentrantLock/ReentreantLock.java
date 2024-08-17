package RentrantLock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentreantLock  extends Thread{
    Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void show() {
        this.lock.lock();
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("hello");
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
        this.lock.unlock();
    };

    @Override
    public void run(){
        show();
    }

    public static void main(String[] arg) {
        ReentreantLock tt1 = new ReentreantLock();
        ReentreantLock tt2 = new ReentreantLock();
        tt1.start();
        tt2.start();
    }
}
