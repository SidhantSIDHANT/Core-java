package Collections;

import java.util.*;


interface Employee {

    public void getSalaryDeatils();
}

class AnonymousInnerClass {
    public void getSalary() {

    }

    public void generateOptValidation() {

    }
}

public class Iterators {
    int c = 10;
    public static List<List<Integer>> list = new ArrayList<List<Integer>>();

    // its only work on ligacy class like Vector
    public void enumeration() {

    }

    public void iterator() {
        list.add(new ArrayList<Integer>());
        list.get(0).add(50);
        list.get(0).add(62);
        list.get(0).add(56);
        list.add(new ArrayList<Integer>());
        list.get(1).add(54);
        list.get(1).add(789);
        list.get(1).add(55);
        list.get(1).add(789631);
        list.get(1).add(548);
        list.get(1).add(5698);
        list.get(1).add(12589);
        System.out.println(list);

        Iterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            List<Integer> list = (List) listIterator.next();
            list.forEach(data -> {
                System.out.println(data);
            });
        }
    }

    public void listIterator(Iterators itr) {
        ArrayList<String> arrList = new ArrayList<String>();
        arrList.add("Java");
        arrList.add("Phython");
        arrList.add("Mongodb");
        arrList.add("Sql");
//      System.out.println(!arrList.contains("Java"));
        arrList.spliterator().forEachRemaining((data) -> {
            System.out.println(data);
        });
        ArrayList<Integer> numberList = new ArrayList<Integer>();
        numberList.add(10);
        numberList.add(20);
        numberList.add(100);
        numberList.add(50);
        numberList.add(70);
        ListIterator<Integer> listIterator = numberList.listIterator(numberList.size());
        while (listIterator.hasPrevious()) {
            System.out.println("" + listIterator.previous());
        }
        System.out.println(numberList);
        Collections.sort(numberList, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return b - a;
            }
        });
        System.out.println(numberList);
    }

    public static void main(String[] arg) {
        Iterators itr = new Iterators();
        itr.listIterator(itr);
        doSomething();
    }

    public static void doSomething() {
        int a = 500;
        Employee emp = () -> {

        };
        Employee emp2 = new Employee() {
            @Override
            public void getSalaryDeatils() {

            }
        };
    }
}
