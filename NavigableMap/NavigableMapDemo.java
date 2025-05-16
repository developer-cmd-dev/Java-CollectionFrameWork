package NavigableMap;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapDemo {
    public static void main(String[] args) {

        NavigableMap<Integer,String>map = new TreeMap<>();
        map.put(1,"One");
        map.put(5,"Five");
        map.put(8,"Eight");
        map.put(3,"Three");

        System.out.println(map);
        System.out.println(map.lastEntry());
        System.out.println(map.lowerKey(2));

    }
}
