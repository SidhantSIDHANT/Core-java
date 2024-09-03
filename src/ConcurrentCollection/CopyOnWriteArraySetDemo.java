package ConcurrentCollection;

import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CopyOnWriteArraySetDemo {

    public void copyOnWriteArraySet() {
        CopyOnWriteArraySet<Integer> copyOnWriteArraySet = new CopyOnWriteArraySet<Integer>();
        copyOnWriteArraySet.add(10);
        copyOnWriteArraySet.add(50);
        copyOnWriteArraySet.add(60);
        copyOnWriteArraySet.add(74);
        copyOnWriteArraySet.add(40);
        boolean containsElement = copyOnWriteArraySet.contains(74);
        boolean isEmpty = copyOnWriteArraySet.isEmpty();
        if (isEmpty) {
            ExecutorService executorService = Executors.newFixedThreadPool(4);
            for (int i = 0; i < 5; i++) {
                executorService.execute(() -> {
                    System.out.println(Thread.currentThread().getName());
                });
            }
            executorService.shutdown();
        }
        boolean removeIf = copyOnWriteArraySet.removeIf(element -> {
            return element == 40;
        });
//        System.out.println(removeIf);

        for (Integer obj : copyOnWriteArraySet) {
            if (copyOnWriteArraySet.contains(60)) {
                copyOnWriteArraySet.add(40);
            }
            System.out.println(copyOnWriteArraySet);
        }
    }

    public static void main(String[] arg) {
        CopyOnWriteArraySetDemo copyOnWriteArraySetDemo = new CopyOnWriteArraySetDemo();
        copyOnWriteArraySetDemo.copyOnWriteArraySet();
    }
}