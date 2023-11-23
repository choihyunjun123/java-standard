package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        String a = "01033334444";
        int l = a.length();
        String b = a.substring(l-4,l);

        System.out.println(b);
    }
}