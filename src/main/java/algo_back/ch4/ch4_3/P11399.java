package algo_back.ch4.ch4_3;

import java.io.*;
import java.util.StringTokenizer;

public class P11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        for (int i = 1; i < N; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        int[] answer = new int[N];
        answer[0] = arr[0];
        for (int i = 1; i < N; i++) {
            answer[i] = answer[i - 1] + arr[i];
        }
        int sum = 0;
        for (int k : answer) {
            sum += k;
        }
        System.out.println(sum);
    }
}
