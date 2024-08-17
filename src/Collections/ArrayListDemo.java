package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArrayListDemo {
    public static void main(String[] arg) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        arrList.add(20);
        arrList.add(30);
        arrList.add(30);
        arrList.add(40);
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("Mumbai", 10);
        hashMap.put("Pune", 20);
        hashMap.put("Channai", 60);
        hashMap.put("Latur", 568);
        for (Map.Entry map : hashMap.entrySet()) {
            System.out.print(map + " ");
        }
    }
}
