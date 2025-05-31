package Queue;


import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Producer implements Runnable{
   private BlockingQueue<Integer> queue;
   private int value = 0;

    public Producer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true){
            try{
                System.out.println("Producer produces: "+value);
                queue.put(value++);
                Thread.sleep(500);
            }catch (Exception e){
                Thread.currentThread().interrupt();
                System.out.println("Producer Interrupted");
            }
        }
    }
}

class Cosumer implements Runnable{
    private BlockingQueue<Integer> queue;

    public Cosumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true){
            try{
                System.out.println("Consumer consumed: "+queue.take());
                Thread.sleep(1000);
            }catch (Exception e){
                Thread.currentThread().interrupt();
                System.out.println("Consumer Interrupted");
            }
        }
    }
}

public class BlockingQueueDemo {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);
        Thread producer = new Thread(new Producer(queue));
        Thread consumer = new Thread(new Cosumer(queue));
        producer.start();
        consumer.start();

    }
}
