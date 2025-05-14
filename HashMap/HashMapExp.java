package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

enum Students {
    Naman,Vaidehi,Neha,Megha,Dev
        }

public class HashMapExp {
    public static void main(String[] args) {
        Map<Integer,Students> map = new HashMap<>();

        for (int i = 0; i <Students.values().length ; i++) {
            map.put(i,Students.values()[i]);
        }
//        Set<Integer> keys = map.keySet();
//        for (int it:keys){
//            System.out.println(map.get(it));
//        }
//
//        for (Map.Entry<Integer, Students> it:map.entrySet()){
//            it.setValue(Students.valueOf(it.getValue().toString().toUpperCase()));
//        }




    }
}
