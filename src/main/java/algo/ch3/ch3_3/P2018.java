package algo.ch3.ch3_3;

import java.util.Scanner;

public class P2018 {
    //    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int answer = 1;
//        for (int i = 1; i < num; i++) {
//            int sum = i;
//            for (int j = i + 1; j <= num; j++) {
//                sum += j;
//                if (sum == num) {
//                    answer++;
//                } else if (sum > num) {
//                    break;
//                }
//            }
//        }
//        System.out.println(answer);
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 1;
        int start_index = 1;
        int end_index = 1;
        int sum = 1;
        while (end_index != N) {
            if (sum == N) {
                count++;
                end_index++;
                sum += end_index;
            } else if (sum > N) {
                sum -= start_index;
                start_index++;
            } else {
                end_index++;
                sum += end_index;
            }
        }
        System.out.println(count);
    }
}
