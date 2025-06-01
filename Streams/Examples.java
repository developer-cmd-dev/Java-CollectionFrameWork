package Streams;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Examples {
    public static void main(String[] args) {

//        Filtering and Collecting name.
        List<String> names = Arrays.asList("Dev","Jhon","V","RDX","Rolex");
        System.out.println(names.stream().filter(x->x.length()>3).toList());


//        Square and Sorting and sum.
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        System.out.println(numbers.stream().map(x->x*x).sorted().toList());
        System.out.println(numbers.stream().map(x->x*x).sorted().reduce(Integer::sum).get());

//        Counting Occurrences of a Character
        String sentence = "Hello world";
        System.out.println(sentence.chars().filter(x->x=='l').count());
    }
}
