package multiThreding;

public class MultiThreding extends Thread {
    static MultiThreding mul = new MultiThreding();

    @Override
    public void run() {
        synchronized (MultiThreding.class) {
            for (int i = 0; i < 5; i++) {
                try {
                    System.out.println("This is the thread " + i + " " + Thread.currentThread().getName());
                    Thread.sleep(1000);
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] arg) throws InterruptedException {
        MultiThreding tt1 = new MultiThreding();
        MultiThreding tt2 = new MultiThreding();
        MultiThreding tt3 = new MultiThreding();
        tt1.start();
        tt2.start();
        tt3.start();
    }
}