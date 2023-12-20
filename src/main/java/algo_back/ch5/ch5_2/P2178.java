package algo_back.ch5.ch5_2;

import java.io.*;
import java.util.*;

public class P2178 {

    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static int N, M;
    static boolean[][] visited;
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N][M];
        visited = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String line = st.nextToken();
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(line.substring(j, j + 1));
            }
        }
        BFS(0, 0);
        System.out.println(arr[N - 1][M - 1]);
    }

    private static void BFS(int a, int b) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{a, b});
        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            for (int k = 0; k < 4; k++) {
                int x = now[0] + dx[k];
                int y = now[1] + dy[k];
                if (x >= 0 && y >= 0 & x < N && y < M) {
                    if (arr[x][y] != 0 && !visited[x][y]) {
                        visited[x][y] = true;
                        arr[x][y] = arr[now[0]][now[1]] + 1;
                        queue.add(new int[]{x, y});
                    }
                }
            }
        }
    }
}
