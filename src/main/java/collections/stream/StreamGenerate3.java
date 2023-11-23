package collections.stream;

import java.util.stream.IntStream;

public class StreamGenerate3 {
    public static void main(String[] args) {
        //        IntStream intStream = IntStream.range(1, 5);  // 1,2,3,4
        IntStream intStream = IntStream.rangeClosed(1, 5);  // 1,2,3,4,5
        intStream.forEach(System.out::println);
    }
}
