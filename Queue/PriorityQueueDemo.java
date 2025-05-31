package Queue;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(10);
        queue.add(15);
        queue.add(5);
        queue.add(8);
        queue.add(67);
        System.out.println(queue);

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }


    }
}
