package Thread;

class Sleep {
    static void sleep(int sleep) {
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}

class Employee {
    public synchronized void test(Employee emp) {
//        synchronized (this) {
        Sleep.sleep(1000);
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName());
//        }
        emp.test2();
    }

    public synchronized void test2() {
        Sleep.sleep(1000);
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName());
    }
}

class Thread1 extends Thread {
    Employee emp1;
    Employee emp2;

    public Thread1(Employee emp1, Employee emp2) {
        this.emp1 = emp1;
        this.emp2 = emp2;
    }

    public void run() {
        for (int i = 0; i < 12; i++) {
            this.emp1.test(emp1);
        }
    }
}

class Thread2 extends Thread {
    Employee emp1;
    Employee emp2;

    public Thread2(Employee emp1, Employee emp2) {
        this.emp1 = emp1;
        this.emp2 = emp2;
    }

    public void run() {
        for (int i = 0; i < 12; i++) {
            Sleep.sleep(1000);
            this.emp2.test(emp2);
        }
    }
}

abstract public class ThreadClass {
    public static void main(String[] arg) {
        Thread1 thread1 = new Thread1(new Employee(), new Employee());
        Thread2 thread2 = new Thread2(new Employee(), new Employee());
        thread1.start();
        thread2.start();
    }
}