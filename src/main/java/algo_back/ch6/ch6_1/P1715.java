package algo_back.ch6.ch6_1;

import java.util.*;

public class P1715 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        PriorityQueue<Integer> arr = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            arr.add(sc.nextInt());
        }
        int num1 = 0;
        int num2 = 0;
        int sum = 0;
        while (arr.size() != 1) {
            num1 = arr.remove();
            num2 = arr.remove();
            sum += num1 + num2;
            arr.add(num1 + num2);
        }
        System.out.println(sum);
    }
}
