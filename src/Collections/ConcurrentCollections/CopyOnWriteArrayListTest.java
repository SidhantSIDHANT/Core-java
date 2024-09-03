package Collections.ConcurrentCollections;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListTest {

    public void copyOnWriteArray() {
        List<Integer> copyOnWriteArrayList = new CopyOnWriteArrayList<Integer>();
        copyOnWriteArrayList.add(200);
        copyOnWriteArrayList.add(300);
        copyOnWriteArrayList.add(400);
        copyOnWriteArrayList.add(500);
        copyOnWriteArrayList.forEach((data) -> {
            System.out.println(data);
        });
        copyOnWriteArrayList.remove(3);
        copyOnWriteArrayList.removeIf((data) -> {
            return data == 400;
        });
        System.out.println(copyOnWriteArrayList);
    }

    public void copyOnWriteList() {
        CopyOnWriteArrayList<Integer> copyOnWriteArrayList = new CopyOnWriteArrayList<Integer>();
        copyOnWriteArrayList.add(20);
        copyOnWriteArrayList.add(30);
        copyOnWriteArrayList.add(50);
        copyOnWriteArrayList.add(70);
        System.out.println(copyOnWriteArrayList);
    }

    public static void main(String[] arg) {
        CopyOnWriteArrayListTest onWriteObj = new CopyOnWriteArrayListTest();
        onWriteObj.copyOnWriteArray();
        onWriteObj.copyOnWriteList();
    }
}
