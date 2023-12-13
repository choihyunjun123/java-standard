package algo_back.ch3.ch3_5;

import java.util.*;

public class P1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int number = 1;
        Stack<Integer> num = new Stack<>();
        List<String> answer = new ArrayList<>();
        boolean result = true;
        for (int k : arr) {
            if (k >= number) {
                while (k >= number) {
                    num.push(number++);
                    answer.add("+");
                }
                num.pop();
                answer.add("-");
            } else {
                if (num.pop() > k) {
                    System.out.println("NO");
                    result = false;
                    break;
                } else {
                    answer.add("-");
                }
            }
        }
        for (String s : answer) {
            if (result) System.out.println(s);
        }
    }
}
