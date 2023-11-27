package stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.partitioningBy;

public class StreamCollector2 {
    static class Student {
        String name;
        int ban;
        int totalScore;
        boolean isMale;

        Student(String name, int ban, int totalScore, boolean isMale) {
            this.name = name;
            this.ban = ban;
            this.totalScore = totalScore;
            this.isMale = isMale;
        }

        String getName() {
            return name;
        }

        int getBan() {
            return ban;
        }

        int getTotalScore() {
            return totalScore;
        }

        boolean isMale() {
            return isMale;
        }
    }

    public static void main(String[] args) {
        Stream<Student> studentStream = Stream.of(
                new Student("이지바", 3, 300, true),
                new Student("김지바", 1, 200, false),
                new Student("안지바", 2, 100, true),
                new Student("박지바", 2, 150, false),
                new Student("소지바", 4, 300, true)
        );
    }
}
