package algo_back.ch5.ch5_2;

import java.io.*;
import java.util.*;

public class P1260 {
    static List<Integer>[] A;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        A = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            A[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            A[a].add(b);
            A[b].add(a);
        }
        for (int i = 1; i <= n; i++) {
            Collections.sort(A[i]);
        }
        visited = new boolean[n + 1];
        DFS(v);
        System.out.println();
        visited = new boolean[n + 1];
        BFS(v);
    }
    private static void DFS(int v) {
        System.out.print(v + " ");
        visited[v] = true;
        for (int k : A[v]) {
            if (!visited[k]) {
                DFS(k);
            }
        }
    }
    private static void BFS(int v) {
        Queue<Integer> que = new LinkedList<>();
        que.add(v);
        visited[v] = true;

        while (!que.isEmpty()) {
            int out = que.poll();
            System.out.print(out + " ");
            for (int k : A[out]) {
                if (!visited[k]) {
                    visited[k] = true;
                    que.add(k);
                }
            }
        }
    }
}
