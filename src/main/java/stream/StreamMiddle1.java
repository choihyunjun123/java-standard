package stream;

import java.util.stream.IntStream;

public class StreamMiddle1 {
    public static void main(String[] args) {
        IntStream intStream = IntStream.rangeClosed(1, 10);
        intStream.skip(3).limit(5).forEach(System.out::println);
    }
}
