package Streams;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        List<String> a = names.stream().filter(x -> x.startsWith("A")).toList();


        List<Integer> nums = Arrays.asList(1, 2, 2, 2, 3, 4, 5, 6, 5, 5);
        HashSet<Integer> integers = new HashSet<>(nums);
        System.out.println(integers);

        ArrayDeque<Integer> collect = new ArrayDeque<>(nums);
        System.out.println(collect);

//        Joining Streams
        String collect1 = names.stream().map(String::toUpperCase).collect(Collectors.joining(", "));
        System.out.println(collect1);

//        Summarizing Data
//        Generate Statisticals summary (count ,sum ,min , average,max)
        IntSummaryStatistics collect2 = nums.stream().collect(Collectors.summarizingInt(x -> x));
        System.out.println(collect2);

//        Grouping Elements.
        List<String> words = Arrays.asList("Hello", "world", "java", "Streams", "Collectors");
        Map<Integer, List<String>> groupBy = words.stream().collect(Collectors.groupingBy(x -> x.length()));
        System.out.println(groupBy);
//        GroupBy joining.
        Map<Integer, String> collect3 = words.stream().collect(Collectors.groupingBy(String::length, Collectors.joining(", ")));
        System.out.println(collect3);
//        GroupBy count
        Map<Integer, Long> collect4 = words.stream().collect(Collectors.groupingBy(String::length, Collectors.counting()));
        System.out.println(collect4);

//        Partioning Elements
        Map<Boolean, List<String>> collect5 = words.stream().collect(Collectors.partitioningBy(x -> x.length() > 5));
        System.out.println(collect5);


//        Example:1
//        Collecting names by length;
        List<String> namesList = Arrays.asList("Dev", "Jhon", "Doe");
        Map<Integer, List<String>>groupOfNames = namesList.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(groupOfNames);

//        Example2:
//        Counting words Occurrences
         String occurrences = "Hello world hello java world";
        Map<String, Long> result = Arrays.stream(occurrences.split(" ")).collect(Collectors.groupingBy(x -> x,Collectors.counting()));
        System.out.println(result);

//        Example3:
//        Partitioning by odd and even
        List<Integer> numbersList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        Map<Boolean, List<Integer>> resultPartitioning = numbersList.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0));
        System.out.println(resultPartitioning);

//        Example4: Summing values in a map
        Optional<Integer> reduce = numbersList.stream().reduce(Integer::sum);
        System.out.println(reduce.get());

//        Example 5: Creating a map from Stream elements;
        Map<String, Integer> collect6 = namesList.stream().collect(Collectors.toMap(x -> x, String::length));
        System.out.println(collect6);

//        Example 6:
        List<String> words2 = Arrays.asList("Mango", "Banana", "apple", "orange", "banana", "apple");
        Map<String, Integer> collect7 = words2.stream().collect(Collectors.toMap(k -> k, v -> 1, (x, y) -> x + y));
        System.out.println(collect7);


    }


}
