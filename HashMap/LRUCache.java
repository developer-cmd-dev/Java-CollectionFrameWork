package HashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K,V> extends LinkedHashMap<K,V> {

    public int capacity;

    public LRUCache(int capacity){
        super(capacity,0.5f,true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size()>capacity;
    }

    public static void main(String[] args) {

        LRUCache<String,Integer> map = new LRUCache<>(3);
        map.put("Bob",50);
        map.put("Naman",50);
        map.put("Jhon",50);
        map.get("Bob");
        map.put("Dev",50);


        System.out.println(map);


    }
}
