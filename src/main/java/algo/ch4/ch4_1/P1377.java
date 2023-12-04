package algo.ch4.ch4_1;

import java.io.*;
import java.util.*;

class Point implements Comparable<Point> {
    int num;
    int idx;

    Point(int num, int idx) {
        this.num = num;
        this.idx = idx;
    }

    @Override
    public int compareTo(Point o) {
        return num - o.num;
    }
}

public class P1377 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        Point[] answer = new Point[N];
        for (int i = 0; i < N; i++) {
            int temp = Integer.parseInt(bufferedReader.readLine());
            answer[i] = new Point(temp, i);
        }
        Arrays.sort(answer);
        int a = 0;
        for (int i = 0; i < N; i++) {
            if (a < answer[i].idx - i) {
                a = answer[i].idx - i;
            }
        }
        System.out.println(a + 1);
    }
}