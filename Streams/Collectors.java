package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;

public class Collectors {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice","Bob","Charlie");
        List<String> a = names.stream().filter(x -> x.startsWith("A")).toList();


        List<Integer> nums = Arrays.asList(1,2,2,2,3,4,5,6,5,5);
        Set<Integer> collect = nums.stream()
                .collect(java.util.stream.Collectors.toSet());
        System.out.println(collect);
    }


}
