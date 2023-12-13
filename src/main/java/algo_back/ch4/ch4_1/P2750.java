package algo_back.ch4.ch4_1;

import java.util.Arrays;
import java.util.Scanner;

public class P2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            answer[i] = sc.nextInt();
        }
        Arrays.sort(answer);
        for (int k : answer) {
            System.out.println(k);
        }
    }
}
