package algo_back.ch4.ch4_5;

import java.io.*;
import java.util.StringTokenizer;

public class P1517 {
    private static int[] A, tmp;
    static long count = 0;
    public static void mergeSort(int s, int e) {
        if (e - s < 1) {
            return;
        }
        int m = s + (e - s) / 2;
        mergeSort(s, m);
        mergeSort(m + 1, e);
        for (int i = s; i <= e; i++) {
            tmp[i] = A[i];
        }
        int k = s;
        int front = s;
        int back = m + 1;
        while (front <= m && back <= e) {
            if (tmp[front] > tmp[back]) {
                A[k] = tmp[back];
                k++;
                back++;
                count += back - k;
            } else {
                A[k] = tmp[front];
                k++;
                front++;
            }
        }
        while (front <= m) {
            A[k] = tmp[front];
            k++;
            front++;
        }
        while (back <= e) {
            A[k] = tmp[back];
            k++;
            back++;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        A = new int[N + 1];
        tmp = new int[N + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        mergeSort(1, N);
        System.out.println(count);
    }
}
