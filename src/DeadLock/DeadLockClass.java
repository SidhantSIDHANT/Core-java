package DeadLock;

public class DeadLockClass {


    public static void main(String[] arg) {
        String resource1 = "This is the java programming lang";
        String resource2 = "This the language ";
        Thread thread = new Thread() {
            public void run() {
                synchronized (resource1) {
                    System.out.println("This is resoucrce 1");
                    synchronized (resource2) {
                        System.out.println("This is innter resoucrce 2");
                    }
                }
            }
        };
        thread.start();

        Thread thread2 = new Thread() {
            public void run() {
                synchronized (resource2) {

                    System.out.println("This is resoucrce 1");
                    synchronized (resource1) {
                        System.out.println("This is innter resoucrce 2");
                    }
                }
            }
        };

    }
}
