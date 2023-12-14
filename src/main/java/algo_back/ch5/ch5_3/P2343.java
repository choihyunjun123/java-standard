package algo_back.ch5.ch5_3;

import java.io.*;
import java.util.*;

public class P2343 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        int start = 0;
        int end = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (start < arr[i]) {
                start = arr[i];
            }
            end += arr[i];
        }
        while (start <= end) {
            int middle = (start + end) / 2;
            int count = 0;
            int sum = 0;
            for (int i = 0; i < N; i++) {
                if (sum + arr[i] > middle) {
                    sum = 0;
                    count++;
                }
                sum += arr[i];
            }
            if (sum != 0) {
                count++;
            }
            if (count > M) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        System.out.println(start);
    }
}
