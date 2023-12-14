package algo_programers;

import java.util.Arrays;
import java.util.Comparator;

public class Failure {
    public static void main(String[] args) {
        int N = 5;
        int[] stages = {1,1,1,2,3,4};
        float len = stages.length;
        float[] result = new float[N + 1];
        for (int i = 1; i <= N; i++) {
            int k = 0;
            for (int s : stages) {
                if (s == i) {
                    k++;
                }
            }
            result[i] = (float) k / len;
            len -= k;
        }
        Integer[] index = new Integer[result.length - 1];
        for (int i = 1; i < result.length; i++) {
            index[i - 1] = i;
        }
        Arrays.sort(index, Comparator.comparingDouble(i -> result[(int) i]).reversed());
        System.out.println(Arrays.toString(result));
    }
}
