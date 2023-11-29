package algo.ch3.ch3_2;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class P10986 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int divNum = sc.nextInt();
        long answer = 0;
        long[] sum = new long[num];
        long[] divArr = new long[divNum];
        sum[0] = sc.nextInt();
        for (int i = 1; i < num; i++) {
            sum[i] = sum[i - 1] + sc.nextInt();
        }
        for (int i = 0; i < num; i++) {
            int div = (int) sum[i] % divNum;
            if (div == 0) {
                answer++;
            }
            divArr[div]++;
        }
        for (long k : divArr) {
            answer += k * (k - 1) / 2;
        }
        System.out.println(answer);
    }
}
