package algo.ch3.ch3_4;

import java.io.*;
import java.util.*;

public class P11003 {
    static class Node {
        public int value;
        public int index;

        Node(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int L = Integer.parseInt(stringTokenizer.nextToken());
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        Deque<Node> arr = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            int k = Integer.parseInt(stringTokenizer.nextToken());
            if (!arr.isEmpty() && arr.getFirst().index <= i - L) {
                arr.removeFirst();
            }
            while (!arr.isEmpty() && arr.getLast().value > k) {
                arr.removeLast();
            }
            arr.addLast(new Node(i, k));
            bufferedWriter.write(arr.getFirst().value + " ");
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}