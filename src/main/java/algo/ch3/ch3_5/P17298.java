package algo.ch3.ch3_5;

import java.io.*;
import java.util.*;

public class P17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int[] arr = new int[N];
        int[] answer = new int[N];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        Stack<Integer> index = new Stack<>();
        index.push(0);
        for (int i = 1; i < N; i++) {
            while (!index.isEmpty() && arr[index.peek()] < arr[i]) {
                answer[index.pop()] = arr[i];
            }
            index.push(i);
        }
        while (!index.isEmpty()) {
            answer[index.pop()] = -1;
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int k : answer) {
            bufferedWriter.write(k + " ");
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
