package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOps {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3);
//        1. Collect
        List<Integer> collect = list.stream().skip(1).collect(Collectors.toList());
        List<Integer> list1 = list.stream().skip(1).toList();

//        2. foreach
        list.stream().forEach(x-> System.out.println(x));

//        3. reduce
        Optional<Integer> reduce = list.stream().reduce((x, y) -> x + y);






    }
}
