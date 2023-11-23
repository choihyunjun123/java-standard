package collections.stream;

import java.util.stream.Stream;

public class StreamGenerate4 {
    public static void main(String[] args) {
        Stream<Integer> evenStream = Stream.iterate(0, n->n+2);
        Stream<Double> randomStream = Stream.generate(Math::random);
        Stream<Integer> oneStream = Stream.generate(()->1);
    }
}
