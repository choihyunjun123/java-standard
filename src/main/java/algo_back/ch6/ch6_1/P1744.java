package algo_back.ch6.ch6_1;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class P1744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int num1 = 0;
        int num2 = 0;
        int sum = 0;
//        if (arr.length != 1) {
            for (int i = N - 1; i > 0; i -= 2) {
                num1 = arr[i];
                num2 = arr[i - 1];
                if (num1 * num2 > num1 + num2) {
                    sum += num1 * num2;
                } else {
                    sum += num1 + num2;
                }
            }
//        }
        if (arr.length % 2 != 0) {
            sum += arr[0];
        }
        System.out.println(sum);
    }
}
