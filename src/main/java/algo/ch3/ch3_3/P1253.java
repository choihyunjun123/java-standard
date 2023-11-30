package algo.ch3.ch3_3;

import java.io.*;
import java.util.*;

public class P1253 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        List<Long> arr = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            arr.add(Long.valueOf(stringTokenizer.nextToken()));
        }
        Collections.sort(arr);
        int answer = 0;
        for (int i = 0; i < num; i++) {
            long target = arr.get(i);
            int start_index = 0;
            int end_index = num - 1;
            while (start_index < end_index) {
                long arrSum = arr.get(start_index) + arr.get(end_index);
                if (arrSum == target) {
                    if (start_index != i && end_index != i) {
                        answer++;
                        break;
                    } else if (start_index == i) {
                        start_index++;
                    } else {
                        end_index--;
                    }
                } else if (arrSum < target) {
                    start_index++;
                } else {
                    end_index--;
                }
            }
        }
        System.out.println(answer);
    }
}
