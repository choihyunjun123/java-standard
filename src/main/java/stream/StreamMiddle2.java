package stream;

import java.util.stream.IntStream;

public class StreamMiddle2 {
    public static void main(String[] args) {
        IntStream intStream = IntStream.of(1, 2, 2, 3, 3, 3, 4, 5, 5, 6);
//        intStream.distinct().forEach(System.out::println);
//        intStream.filter(i -> i % 2 == 0).forEach(System.out::println);
//        intStream.filter(i -> i % 2 == 0 && i % 3 != 0).forEach(System.out::println);
        intStream.filter(i -> i % 2 == 0)
                 .filter(i -> i % 3 != 0)
                 .distinct()
                 .forEach(System.out::println);
    }
}
