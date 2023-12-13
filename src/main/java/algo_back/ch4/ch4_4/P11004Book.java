package algo_back.ch4.ch4_4;

import java.io.*;
import java.util.*;

public class P11004Book {

    public static void quickSort(int[] A, int S, int E, int K) {
        if (S < E) {
            int pivot = partition(A, S, E);
            if (pivot == K) {
                return;
            } else if (K < pivot) {
                quickSort(A, S, pivot - 1, K);
            } else {
                quickSort(A, pivot + 1, E, K);
            }
        }
    }

    public static int partition(int[] A, int S, int E) {
        int M = (S + E) / 2;
        swap(A, S, M);
        int pivot = A[S];
        int i = S, j = E;
        while (i < j) {
            while (pivot < A[j]) {
                j--;
            }
            while (pivot > A[i]) {
                i++;
            }
            swap(A, i, j);
        }
        A[S] = A[i];
        A[i] = pivot;
        return i;
    }

    public static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
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
        quickSort(arr, 0, N - 1, K - 1);
        System.out.println(arr[K - 1]);
    }
}
