package stream;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollector1 {
    public static void main(String[] args) {
        Stream<File> fileStream = Stream.of(new File("Ex1.java"),
                new File("Ex1"),
                new File("Ex1.bak"),
                new File("Ex1.java"),
                new File("Ex1.txt"));
//        List<String> names = fileStream.map(File::getName)
//                .toList();
//        Set<String> names = fileStream
//                .map(File::getName)
//                .collect(Collectors.toSet());
        Map<String, String> names = fileStream
                .distinct()
                .collect(Collectors.toMap(File::getName, i -> i + "1"));
        System.out.println(names);
    }
}
