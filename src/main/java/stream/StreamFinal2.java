package stream;

import java.io.File;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamFinal2 {
    public static void main(String[] args) {
        Stream<File> fileStream = Stream.of(new File("Ex1.java"),
                new File("Ex1"),
                new File("Ex1.bak"),
                new File("Ex1.java"),
                new File("Ex1.txt"));

//        boolean hasFile = fileStream.allMatch(s -> s.getName().contains("E"));
//        boolean hasFile = fileStream.anyMatch(s -> s.getName().contains("bak"));
//        boolean hasFile = fileStream.noneMatch(s -> s.getName().contains("Ee"));
//        System.out.println(hasFile);

//        Optional<File> result = fileStream
//                .filter(s->s.getName().contains("E"))
//                .findFirst();
        Optional<File> result = fileStream
                .filter(s -> s.getName().contains("b"))
                .findAny();
        System.out.println(result.get());
    }
}
