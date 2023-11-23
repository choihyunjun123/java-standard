package stream;

import java.util.*;

public class StreamFinal3 {
    public static void main(String[] args) {
        List<Integer> a = List.of(1, 2);
        int sum = a.stream()
                .mapToInt(i -> i)
                .sum();
//        OptionalDouble avg = a.stream()
//                .mapToInt(i -> i)
//                .average();
//        long count = a.stream()
//                .count();
//        int min = a.stream()
//                .mapToInt(i -> i)
//                .min()
//                .getAsInt();
//        int max = a.stream()
//                .mapToInt(i -> i)
//                .max()
//                .getAsInt();
        System.out.println(sum);
    }
}
