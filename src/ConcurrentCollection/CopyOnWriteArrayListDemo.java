package ConcurrentCollection;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public void concurrentArrayList() {
        CopyOnWriteArrayList<Integer> copyOnWriteArrayList = new CopyOnWriteArrayList();
        copyOnWriteArrayList.add(10);
        copyOnWriteArrayList.add(20);
        copyOnWriteArrayList.add(55);
        copyOnWriteArrayList.add(333);
        Integer size = copyOnWriteArrayList.size();
        System.out.println(size);
        copyOnWriteArrayList.forEach((element) -> {
            System.out.println(element);
        });

        Iterator iterator = copyOnWriteArrayList.iterator();
        while (iterator.hasNext()) {
            copyOnWriteArrayList.add(50);
            copyOnWriteArrayList.add(60);
            System.out.println(iterator.next());
        }
        System.out.println(copyOnWriteArrayList);
    }

    public static void main(String[] arg) {
        CopyOnWriteArrayListDemo copyOnWriteArrayListDemo = new CopyOnWriteArrayListDemo();
        copyOnWriteArrayListDemo.concurrentArrayList();
    }
}