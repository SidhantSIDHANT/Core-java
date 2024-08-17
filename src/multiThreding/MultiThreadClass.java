package multiThreding;

public class MultiThreadClass extends Thread {
    @Override
    public void run() {
        synchronized (MultiThreadClass.class) {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread is " + i + " " + Thread.currentThread().getName());
                try {
                    Thread.currentThread().sleep(1000);
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] arg) throws InterruptedException {
        MultiThreadClass thread1 = new MultiThreadClass();
        MultiThreadClass thread2 = new MultiThreadClass();
        MultiThreadClass thread3 = new MultiThreadClass();
        thread1.start();
        thread2.start();
        thread3.start();
    }
}