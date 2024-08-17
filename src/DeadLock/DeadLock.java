package DeadLock;

import java.io.IOException;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Thread1 extends Thread {
     public  ReentrantLock lock = new ReentrantLock();

    public  void show() {
//       synchronized(Thread1.class){
           for (int i = 0; i <= 5; i++) {
               try {
                   Thread.sleep(1000);
                   System.out.println(" " + i);
               } catch (InterruptedException ie) {
                   ie.printStackTrace();
               }
           }
//       }
    }

    Thread1(ReentrantLock r) {
//        this.lock = r;
    }

    @Override
    public void run() {
        show();
//        synchronized (Thread1.class) {
//            System.out.println("This is the t1 lock");
////            System.out.println(this.lock.getOwner());
//            if (this.lock.tryLock()) {
//                synchronized (Thread2.class) {
//                    System.out.println("This is the t2 lock");
//                }
//            }
//        }
    }
}

class Thread2 extends Thread {
    private volatile Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    Thread2(ReentrantLock r) {
        this.lock = r;
    }

    @Override
    public void run() {
//        synchronized (Thread2.class) {
//            System.out.println("This is the t2 lock");
//            if (this.lock.tryLock()) {
//                synchronized (Thread1.class) {
//                    System.out.println("This is the t1 lock");
//                }
//            }
//        }
    }
}


public class DeadLock {
    public static void main(String[] arg) {
        Thread1 tt1 = new Thread1(new ReentrantLock());
        Thread1 tt11 = new Thread1(new ReentrantLock());
        Thread2 tt2 = new Thread2(new ReentrantLock());
        tt1.start();
        tt11.start();
        tt2.start();
    }
}
