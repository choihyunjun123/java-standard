package stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamMiddle6 {
    public static void main(String[] args) {
        Stream<String[]> strArrStrm = Stream.of(new String[]{"abc", "def", "ghi"},
                new String[]{"ABC", "GHI", "JKLMN"});
//        Stream<Stream<String>> strStrStrm = strArrStrm.map(Arrays::stream);
        Stream<String> strStrStrm = strArrStrm.flatMap(Arrays::stream);
        System.out.println(Arrays.toString(strStrStrm.toArray()));
    }
}
