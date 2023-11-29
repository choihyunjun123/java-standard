package algo.ch3.ch3_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P1546 {
    public static void main(String[] args) {
        ArrayList<Integer> score = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            score.add(sc.nextInt());
        }
        int max = Collections.max(score);
        double sum = score
                .stream()
                .mapToInt(i -> i)
                .sum();
        double avg = (sum * 100) / 3 / max;
        System.out.println(avg);
    }
}
