package algo.ch3.ch3_3;

import java.io.*;
import java.util.*;

public class P1940 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bufferedReader.readLine());
        int sum = Integer.parseInt(bufferedReader.readLine());
        int answer = 0;
        int start_index = 0;
        int end_index = num - 1;
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            arr.add(Integer.parseInt(stringTokenizer.nextToken()));
        }
        Collections.sort(arr);
        while (start_index < end_index) {
            int arrSum = arr.get(start_index) + arr.get(end_index);
            if (arrSum < sum) {
                start_index++;
            } else if (arrSum > sum) {
                end_index--;
            } else {
                start_index++;
                end_index--;
                answer++;
            }
        }
        System.out.println(answer);
    }
}
