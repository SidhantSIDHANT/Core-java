package ComparatorAndComparable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class SortWithComparator {
    String name;
    String lName;
    int age;

    SortWithComparator(String name, String lName, int age) {
        this.name = name;
        this.lName = lName;
        this.age = age;
    }

    public String toString() {
        return "{" + this.name + " " + this.lName + " " + this.age + "}";
    }
}

class CompareWithAge implements Comparator<SortWithComparator> {

    public int compare(SortWithComparator obj1, SortWithComparator obj2) {
        return obj1.age - obj2.age;
    }
}

class CompareWithFirstName implements Comparator<SortWithComparator> {

    public int compare(SortWithComparator obj1, SortWithComparator obj2) {
        return obj1.name.compareTo(obj2.name);
    }
}

public class ComparatorDemo {
    public static void main(String[] arg) {
        SortWithComparator es1 = new SortWithComparator("AAA", "BBB", 4568);
        SortWithComparator es2 = new SortWithComparator("BB0", "CC", 4569);
        SortWithComparator es3 = new SortWithComparator("CC", "ABC", 78950);
        List<SortWithComparator> list = new ArrayList<SortWithComparator>();
        list.add(es2);
        list.add(es1);
        list.add(es3);
        System.out.println(list);
        java.util.Collections.sort(list, new CompareWithAge());
        System.out.println(list);
        Comparator<SortWithComparator> sortWithAge = (SortWithComparator obj1 , SortWithComparator obj2) ->{
            return obj1.age - obj2.age;
        };
        java.util.Collections.sort(list, sortWithAge);
        System.out.println(list);
    }
}
