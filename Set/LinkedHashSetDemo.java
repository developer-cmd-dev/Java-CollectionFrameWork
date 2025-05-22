package Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo
{
    public static void main(String[] args) {

        Set<Integer> set = new LinkedHashSet<>();
        set.add(1);
        set.add(4);
        set.add(9);
        set.add(8);
        System.out.println(set);
    }
}
