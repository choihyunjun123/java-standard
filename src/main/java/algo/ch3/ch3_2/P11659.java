package algo.ch3.ch3_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class P11659 {
    //    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[] a = {sc.nextInt(), sc.nextInt()};
//        int[] nums = new int[a[0] + 1];
//        int[] sum = new int[a[0] + 1];
//        int[] answer = new int[a[1]];
//        for (int i = 1; i < nums.length; i++) {
//            nums[i] = sc.nextInt();
//        }
//        for (int i = 1; i < sum.length; i++) {
//            sum[i] = sum[i - 1] + nums[i];
//        }
//        for (int i = 0; i < a[1]; i++) {
//            answer[i] = -sum[sc.nextInt() - 1] + sum[sc.nextInt()];
//        }
//        for (int num : answer) {
//            System.out.println(num);
//        }
//    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int suNo = Integer.parseInt(stringTokenizer.nextToken());
        int quizNo = Integer.parseInt(stringTokenizer.nextToken());
        long[] sum = new long[suNo + 1];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 1; i <= suNo; i++) {
            sum[i] = sum[i - 1] + Integer.parseInt(stringTokenizer.nextToken());
        }
        System.out.println(Arrays.toString(sum));
    }
}
