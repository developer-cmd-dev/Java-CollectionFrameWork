package SortedMap;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {
    public static void main(String[] args) {

        SortedMap<Integer, String> map = new TreeMap<>((a,b)->b-a);
        map.put(1,"Dev");
        map.put(5,"Vaidehi");
        map.put(8,"Naman");
        map.put(7,"Neha");
        map.put(4,"Jhon doe");
        System.out.println(map);


    }
}
