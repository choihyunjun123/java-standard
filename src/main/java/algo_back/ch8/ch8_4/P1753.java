package algo_back.ch8.ch8_4;

import java.io.*;
import java.util.*;

public class P1753 {
    static class Edge implements Comparable<Edge> {
        int node, value;

        Edge(int node, int value) {
            this.node = node;
            this.value = value;
        }


        @Override
        public int compareTo(Edge o) {
            if (this.value > o.value) {
                return 1;
            } else {
                return -1;
            }
        }
    }

    static int V, E, K;
    static ArrayList<Edge>[] arr;
    static boolean[] visited;
    static int[] distance;
    static PriorityQueue<Edge> que = new PriorityQueue<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(br.readLine());

        arr = new ArrayList[V + 1];
        visited = new boolean[V + 1];
        distance = new int[V + 1];
        for (int i = 0; i <= V; i++) {
            arr[i] = new ArrayList<>();
            distance[i] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            arr[a].add(new Edge(b, c));
        }
        que.add(new Edge(K, 0));
        distance[K] = 0;
        while (!que.isEmpty()) {
            Edge current = que.poll();
            int cv = current.node;
            if (visited[cv]) {
                continue;
            }
            visited[cv] = true;
            for (int i = 0; i < arr[cv].size(); i++) {
                Edge tmp = arr[cv].get(i);
                int next = tmp.node;
                int value = tmp.value;
                if (distance[next] > value + distance[cv]) {
                    distance[next] = value + distance[cv];
                    que.add(new Edge(next, distance[next]));
                }
            }
        }
        for (int i = 1; i <= V; i++) {
            if (visited[i]) {
                System.out.println(distance[i]);
            } else {
                System.out.println("INF");
            }
        }
    }
}
