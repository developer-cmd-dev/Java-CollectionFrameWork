package Streams;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveStreams {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5};
        IntStream stream = Arrays.stream(numbers);
        Stream<Integer> boxed = stream.boxed();
        System.out.println(boxed.toList());

        IntStream ints = new Random().ints(10);
        System.out.println(ints.boxed().toList());

    }
}
