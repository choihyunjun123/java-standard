package collections.stream;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamMiddle3 {
    public static void main(String[] args) {
        Stream<String> strStream = Stream.of("dd", "aaa", "CC", "cc", "b");
//        strStream.sorted().forEach(System.out::println);
//        strStream.sorted((s1, s2) -> s2.compareTo(s1)).forEach(System.out::println);
        strStream.sorted(Comparator.comparing(String::length).reversed())
                 .forEach(System.out::println);
    }
}
