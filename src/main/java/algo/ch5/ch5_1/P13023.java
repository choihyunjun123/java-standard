package algo.ch5.ch5_1;

import java.io.*;
import java.util.*;

public class P13023 {

    static List<Integer>[] A;
    static boolean[] visited;
    static boolean result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        A = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            A[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            A[a].add(b);
            A[b].add(a);
        }
        visited = new boolean[n];
        result = false;
        for (int i = 0; i < n; i++) {
                DFS(i, 1);
            if (result) {
                break;
            }
        }
        if (result) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    private static void DFS(int k, int depth) {
        if (depth == 5) {
            result = true;
            return;
        }
        visited[k] = true;
        for (int s : A[k]) {
            if (!visited[s]) {
                DFS(s, depth + 1);
            }
        }
        visited[k] = false;
    }
}
