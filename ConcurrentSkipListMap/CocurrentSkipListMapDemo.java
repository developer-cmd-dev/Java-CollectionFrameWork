package ConcurrentSkipListMap;

import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;

public class CocurrentSkipListMapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map = new ConcurrentSkipListMap<>();

        map.put(1,"Dev");
        map.put(4,"Dev");
        map.put(3,"Dev");
        map.put(6,"Dev");
        System.out.println(map);

    }
}
