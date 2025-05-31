package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermidiateOps {
    public static void main(String[] args) {

//  1. Filter
        List<String>list = Arrays.asList("Dev","Mandal","Devil","Dare","Gojo Saturu");
        list.stream().filter(x->x.startsWith("D"));

        //  2. map
        Stream<String> stringStream = list.stream().map(value -> value.toUpperCase());

//       3. Sorted
        Stream<String> sorted = list.stream().sorted((a,b)->b.length()-a.length());

//        4. Distinct
        Stream<String> distinct = list.stream().distinct();

    }
}
