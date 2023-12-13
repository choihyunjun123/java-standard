package algo_back.ch3.ch3_5;

import java.util.*;

public class P2164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Deque<Integer> arr = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            arr.addLast(i);
        }
        while (arr.size() != 1) {
            arr.removeFirst();
            arr.addLast(arr.removeFirst());
        }
        System.out.println(arr.poll());
    }
}
