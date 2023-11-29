package algo.ch3.ch3_2;

import java.util.Scanner;

public class P11660 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] lt = {sc.nextInt(), sc.nextInt()};
        int[][] arr = new int[lt[0] + 1][lt[0] + 1];
        int[][] sumArr = new int[lt[0] + 1][lt[0] + 1];
        int[][] trial = new int[lt[1]][4];
        int[] answer = new int[lt[1]];
        for (int i = 1; i < lt[0] + 1; i++) {
            for (int j = 1; j < lt[0] + 1; j++) {
                arr[i][j] = sc.nextInt();
            }
            arr[i][0] = arr[i][1];
        }
        for (int i = 0; i < lt[1]; i++) {
            for (int j = 0; j < 4; j++) {
                trial[i][j] = sc.nextInt();
            }
        }
        arr[0] = arr[1];
        sumArr[1][1] = arr[1][1];
        for (int i = 2; i < lt[0] + 1; i++) {
            sumArr[1][i] = sumArr[1][i - 1] + arr[1][i];
        }
        for (int i = 2; i < lt[0] + 1; i++) {
            sumArr[i][1] = sumArr[i - 1][1] + arr[i][1];
        }
        for (int i = 2; i < lt[0] + 1; i++) {
            for (int j = 2; j < lt[0] + 1; j++) {
                sumArr[i][j] = sumArr[i - 1][j] + sumArr[i][j - 1] - sumArr[i - 1][j - 1] + arr[i][j];
            }
        }
        for (int i = 0; i < lt[1]; i++) {
            answer[i] = sumArr[trial[i][2]][trial[i][3]]
                    - sumArr[trial[i][0] - 1][trial[i][3]]
                    - sumArr[trial[i][2]][trial[i][1] - 1]
                    + sumArr[trial[i][0] - 1][trial[i][1] - 1];
        }
        for (int k : answer) {
            System.out.println(k);
        }

    }
}
