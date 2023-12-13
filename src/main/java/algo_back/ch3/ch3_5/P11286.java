package algo_back.ch3.ch3_5;

import java.util.*;

public class P11286 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        PriorityQueue<Integer> arr = new PriorityQueue<>((o1, o2) -> {
            int a1 = Math.abs(o1);
            int a2 = Math.abs(o2);
            if (a1 == a2) {
                return o1 > o2 ? 1 : -1;
            } else {
                return a1 - a2;
            }
        });
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int k = sc.nextInt();
            if (k != 0) {
                arr.add(k);
            } else {
                if (!arr.isEmpty()) {
                    answer.add(arr.poll());
                } else {
                    answer.add(0);
                }
            }
        }
        for (int k : answer) {
            System.out.println(k);
        }
    }
}
