package org.example;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main3 {
    public static void main(String[] args) {
        List<Integer> a = List.of(1, 2, 4, 4, 4);
        Set<Integer> b = a.stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toSet());
        System.out.println(b);
    }
}
