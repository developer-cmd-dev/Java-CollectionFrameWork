package Comparable;

import java.util.ArrayList;
import java.util.List;

public class ComparableDemo {
    public static void main(String[] args) {
    List<Student> list = new ArrayList<>();
    list.add(new Student("Dev kumar",9.5f));
    list.add(new Student("Naman Mandal",8.5f));
    list.add(new Student("Vaidehi Mandal",7.5f));
    list.sort(null);
        System.out.println(list);

    }
}
