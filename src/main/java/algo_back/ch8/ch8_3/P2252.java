package algo_back.ch8.ch8_3;

import java.io.*;
import java.util.*;

public class P2252 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        List<List<Integer>> arr = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            arr.add(new ArrayList<>());
        }
        int[] indegree = new int[N + 1];
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr.get(a).add(b);
            indegree[b]++;
        }
        Queue<Integer> que = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            if (indegree[i] == 0) {
                que.offer(i);
            }
        }
        while (!que.isEmpty()) {
            int now = que.poll();
            System.out.println(now);
            for (int i : arr.get(now)) {
                indegree[i]--;
                if (indegree[i] == 0) {
                    que.offer(i);
                }
            }
        }
    }
}
