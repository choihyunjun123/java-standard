package collections.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamGenerate2 {
    public static void main(String[] args) {
//        Stream<String> strStream = Stream.of("a", "b", "c");
//        Stream<String> strStream = Stream.of(new String[]{"a", "b", "c"});
//        Stream<String> strStream = Arrays.stream(new String[]{"a", "b", "c"});
        Stream<String> strStream = Arrays.stream(new String[]{"a", "b", "c"}, 0, 3);
        strStream.forEach(System.out::println);
    }
}
