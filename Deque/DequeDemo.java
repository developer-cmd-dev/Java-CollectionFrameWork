package Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {
    public static void main(String[] args) {

        Deque<Integer> deque= new ArrayDeque<>();
        deque.addFirst(20);
        deque.offerLast(45);
        deque.addLast(56);
        deque.offerLast(67);
        System.out.println(deque);

        deque.pollFirst();
        deque.pollLast();
        System.out.println(deque);


    }
}
