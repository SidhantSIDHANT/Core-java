package ComparableAndComparator;

import java.util.TreeSet;

class Comparable{

}

public class ComparableTest {

    public static void main(String[] arg){
        TreeSet<StringBuffer> treeSet = new TreeSet<StringBuffer>();
        treeSet.add(new StringBuffer("A"));
        treeSet.add(new StringBuffer("C"));
        treeSet.add(new StringBuffer("B"));
        System.out.println(treeSet);
    }
}
