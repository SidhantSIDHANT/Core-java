package Thread.SynchronizedBlock;

public class SynchronizedBlocks extends Thread {


    //Synchronized Method: --> it is not working.
    public synchronized void synchronizationMethod() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Synchronized Method " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }

    //Synchronized block
    public void synchronizedBlock() {
        synchronized (SynchronizedBlocks.class) {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1000);
                    System.out.println("Synchronized block " + i);
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
            }
        }
    }

    //Static Synchronization :
    public static synchronized void staticSynchronizedBlock() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
            System.out.println(" Static Synchronization " + i);
        }
    }

    @Override
    public void run() {
        synchronized (SynchronizedBlocks.class) {
            synchronizationMethod();
        }
        synchronized (SynchronizedBlocks.class) {
            synchronizedBlock();
        }
        synchronized (SynchronizedBlocks.class) {
            staticSynchronizedBlock();
        }

    }

    public static void main(String[] arg) {
        SynchronizedBlocks tt1 = new SynchronizedBlocks();
        SynchronizedBlocks tt2 = new SynchronizedBlocks();
        SynchronizedBlocks tt3 = new SynchronizedBlocks();
//        tt1.start();
//        tt2.start();
//        tt3.start();
        System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
    }
}