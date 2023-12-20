package algo_back.ch6.ch6_1;

import java.io.*;
import java.util.*;

public class P11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] money = new int[N];
        for (int i = 0; i < N; i++) {
            money[i] = Integer.parseInt(br.readLine());
        }
        int count = 0;
        for (int i = N - 1; i >= 0; i--) {
            if (money[i] <= K) {
                count += K / money[i];
                K = K % money[i];
            }
            if (K == 0) {
                break;
            }
        }
        System.out.println(count);
    }
}
