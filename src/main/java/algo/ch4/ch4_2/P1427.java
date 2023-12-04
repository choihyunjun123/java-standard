package algo.ch4.ch4_2;

import java.util.Scanner;

public class P1427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        int[] answer = new int[N.length()];
        for (int i = 0; i < N.length(); i++) {
            answer[i] = Integer.parseInt(N.substring(i, i + 1));
        }
        for (int i = 0; i < answer.length; i++) {
            int max = i;
            for (int j = i + 1; j < answer.length; j++) {
                if (answer[j] > answer[max]) {
                    max = j;
                }
            }
            int k = answer[i];
            answer[i] = answer[max];
            answer[max] = k;
        }
        for (int s : answer) {
            System.out.print(s);
        }
    }
}
