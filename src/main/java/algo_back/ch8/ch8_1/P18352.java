package algo_back.ch8.ch8_1;

import java.io.*;
import java.util.*;

public class P18352 {
    static List<Integer>[] A;
    static int visited[];
    static int N, M, K, X;
    static List<Integer> answer;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        K = sc.nextInt();
        X = sc.nextInt();
        A = new ArrayList[N + 1];
        answer = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            A[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            A[a].add(b);
        }
        visited = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            visited[i] = -1;
        }
        BFS(X);
        for (int i = 0; i <= N; i++) {
            if (visited[i] == K) {
                answer.add(i);
            }
        }
        if (answer.isEmpty()) {
            System.out.println("-1");
        } else {
            for (int i : answer) {
                System.out.println(i);
            }
        }
    }

    private static void BFS(int x) {
        Queue<Integer> que = new LinkedList<>();
        que.add(x);
        visited[x] = 0;
        while (!que.isEmpty()) {
            int a = que.poll();
            for (int i : A[a]) {
                if (visited[i] == -1) {
                    visited[i] = visited[a] + 1;
                    que.add(i);
                }
            }
        }
    }

}
