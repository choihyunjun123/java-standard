package stream;

import java.util.stream.IntStream;

public class StreamFinal1 {
    public static void main(String[] args) {
//        IntStream.range(1, 10).sequential().forEach(System.out::println);
//        IntStream.range(1, 10).sequential().forEachOrdered(System.out::println);
//        IntStream.range(1, 10).parallel().forEach(System.out::println);
        IntStream.range(1, 10).parallel().forEachOrdered(System.out::println);
    }
}
