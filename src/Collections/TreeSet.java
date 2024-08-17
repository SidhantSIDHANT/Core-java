package Collections;

import java.util.Comparator;
import java.util.Set;

class EmployeeData implements Comparable<EmployeeData> {
    String name;
    String lName;
    String email;
    int contactNumber;
    int age;

    EmployeeData(String name, String lName, String email, int number, int age) {
        this.name = name;
        this.lName = lName;
        this.email = email;
        this.contactNumber = number;
        this.age = age;

    }

    @Override
    public String toString() {
        return "[" + name + " " + lName + " " + email + " " + contactNumber + " " + age + "]";
    }

    @Override
    public int compareTo(EmployeeData emp) {
        if (emp.age > this.age)
            return -1;
        else if (emp.age < this.age)
            return 1;
        else
            return 0;
    }
}


public class TreeSet<Integer> {

    public static void main(String[] arg) {
        EmployeeData em1 = new EmployeeData("rava", "sham", "sham@gamil.com", 256987, 44);
        EmployeeData em2 = new EmployeeData("java", "progrraming", "java@gmail", 4789, 22);
        EmployeeData em3 = new EmployeeData("rohit", "sharama", "rohit@gmail.com", 457889, 25);
        EmployeeData em4 = new EmployeeData("vk", "kohli", "vk@gmail.com", 1598, 19);
        Comparator<EmployeeData> comparator = (EmployeeData ob1, EmployeeData ob2) -> ob1.name.compareTo(ob2.name);

        Set<EmployeeData> treeSet = new java.util.TreeSet<EmployeeData>();
        treeSet.add(em1);
        treeSet.add(em4);
        treeSet.add(em3);
        treeSet.add(em2);
        System.out.println(treeSet);

    }
}
