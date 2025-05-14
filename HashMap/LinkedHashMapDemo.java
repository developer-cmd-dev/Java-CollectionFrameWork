package HashMap;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class LinkedHashMapDemo {
    public static void main(String[] args) {

        LinkedHashMap<String,Integer> lmap = new LinkedHashMap<>(11,0.5f,true);
        lmap.put("Orange",59);
        lmap.put("Guava",60);
        lmap.put("Apple",40);
        lmap.get("Guava");
        System.out.println(lmap);

    }
}
