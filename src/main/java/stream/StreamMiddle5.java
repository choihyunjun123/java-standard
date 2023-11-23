package stream;

import java.util.Arrays;
import java.util.OptionalDouble;

public class StreamMiddle5 {
    public static void main(String[] args) {
        int[] a = {1, 4, 8, 2, 5, 45, 3, 4, 7};
        int sum = Arrays.stream(a)
                .distinct()
                .sum();
        OptionalDouble avg = Arrays.stream(a)
                .distinct()
                .average();
        double avg2 = avg.getAsDouble();
        System.out.println(avg2);
    }
}
