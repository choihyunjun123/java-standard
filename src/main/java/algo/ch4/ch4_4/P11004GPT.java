package algo.ch4.ch4_4;

import java.io.*;
import java.util.StringTokenizer;

public class P11004GPT {

    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int num = division(arr, start, end);
            quickSort(arr, start, num - 1);
            quickSort(arr, num + 1, end);
        }
    }

    public static int division(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start - 1;
        for (int j = start; j < end; j++) {
            if (arr[j] < pivot) {
                i++;
                int k = arr[i];
                arr[i] = arr[j];
                arr[j] = k;
            }
        }
        int kk = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = kk;
        return i + 1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(bufferedReader.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        quickSort(arr, 0, N - 1);
        System.out.println(arr[K - 1]);
    }
}
