import java.util.Hashtable;

public class Main {
    public static void main(String[] arg) {
        Hashtable<Integer, Integer> hashtable = new Hashtable();
        hashtable.put(10, 23);
        hashtable.put(10, 50);
        hashtable.put(20, 60);
        hashtable.put(10, 5555);
        System.out.println(hashtable);
    }
}
