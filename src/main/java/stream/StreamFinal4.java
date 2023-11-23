package stream;

import java.util.List;

public class StreamFinal4 {
    public static void main(String[] args) {
        List<Integer> a = List.of(1, 2, 3, 4);
        Integer sum = a.stream()
                .reduce(Integer::sum)
                .get();
        Integer min = a.stream()
                .reduce(Integer::min)
                .get();
        Integer max = a.stream()
                .reduce(Integer::max)
                .get();
        System.out.println(max);
    }
}
