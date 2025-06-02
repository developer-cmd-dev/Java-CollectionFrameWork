package Streams;

import javax.xml.transform.Source;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
//        Predicate
     Predicate<Integer> predicate = x->x%2==0;
        System.out.println(predicate.test(5));

        Predicate<String> isWordStartingWithA = x->x.startsWith("A");
        Predicate<String> isWordEndsWithX = x->x.endsWith("x");
        Predicate<String> and = isWordStartingWithA.and(isWordEndsWithX);
        System.out.println(and.test("Astrix"));

//        Function
        Function<Integer,Integer> doubleIt=x->x*2;
        Function<Integer,Integer>tripleIt = x->x*3;
        Integer apply = doubleIt.andThen(tripleIt).apply(45);
        System.out.println(apply);

//        Consumer
        Consumer<String> consumeName = x-> System.out.println(x.toUpperCase());
        consumeName.accept("dev");

//        Method Reference;
        List<String> list = Arrays.asList("Ram", "Shyam", "Ghanshyam");
        Consumer<List<String>> consumer = (System.out::println);
        consumer.accept(list);

    }
}
