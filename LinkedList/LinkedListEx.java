package LinkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListEx {
    public static void main(String[] args) {

        System.out.println("LinkedList");

        List<Integer> linkedList=new LinkedList<>();
        for (int i = 0; i <10 ; i++) {
            linkedList.add(i);

        }
        System.out.println(linkedList);
        linkedList.remove(5);
        System.out.println(linkedList);
        ListIterator<Integer> integerListIterator = linkedList.listIterator();

    }
}
