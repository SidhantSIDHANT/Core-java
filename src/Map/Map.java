package Map;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Map{
    int a = 100;

    public static void m1(String... arg) {
        System.out.println(arg);
    }

    public void show() {

    }

    public void showInnerHashMap() {

    }

    public static void main(String... arg) {
        java.util.Map<String, Integer> hashMap = new java.util.HashMap<String, Integer>();
        hashMap.put("key1", 10);
        hashMap.put("key2", 20);
        hashMap.put("key3", 30);
        hashMap.put("key4", 40);
        Iterator<java.util.Map.Entry<String, Integer>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            java.util.Map.Entry<String, Integer> entry = iterator.next();
            String hashMapStringVal = entry.getKey();
            Integer hashMapIntegerVal = entry.getValue();
            System.out.println(hashMapStringVal + ":" + hashMapIntegerVal);
        }
        LinkedList<Integer> linked = new LinkedList<Integer>();
        linked.add(20);
        linked.add(10);
        linked.add(40);
        linked.add(30);
        linked.add(50);
        List<Integer> filterdList = linked.stream().filter(x -> x % 2 == 0).map((x) -> x * 23).limit(2).collect(Collectors.toList());
        System.out.println(filterdList);
    }
}
