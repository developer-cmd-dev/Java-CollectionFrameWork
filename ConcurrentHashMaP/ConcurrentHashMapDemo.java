package ConcurrentHashMaP;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentHashMapDemo {
    public static void main(String[] args) {

        ConcurrentMap<Integer,String> map = new ConcurrentHashMap<>();

        Thread thread1 = new Thread(()->{
            for (int i = 0; i <1000 ; i++) {
                map.put(i,"Thread-1");

            }
        });

        Thread thread2 = new Thread(()->{
            for (int i = 0; i <1000 ; i++) {
                System.out.println(map.get(i));

            }
        });

        thread1.start();
        thread2.start();

        try{
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(map.size());


    }
}
