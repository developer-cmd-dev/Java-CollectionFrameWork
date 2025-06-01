package Streams;

import java.util.List;
import java.util.stream.Stream;

public class ParallelStream {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        List<Integer> list = Stream.iterate(1, x -> x + 1).limit(20000).toList();
        List<Long> list1 = list.stream().map(ParallelStream::factorial).toList();
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken with sequential stream: "+(endTime-startTime)+" ms  ");

        startTime = System.currentTimeMillis();
         list1 = list.parallelStream().map(ParallelStream::factorial).toList();
         endTime = System.currentTimeMillis();
        System.out.println("Time taken with parallelStream: "+(endTime-startTime)+" ms  ");


    }

    private static long factorial(int n) {
        int res = 1;
        for (int i = 2; i <=n ; i++) {
            res*=i;

        }
        return res;
    }
}
