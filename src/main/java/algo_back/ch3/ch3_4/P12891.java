package algo_back.ch3.ch3_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P12891 {
    static int[] countDNA(String sequence, int length) {
        int[] count = new int[4];
        for (int i = 0; i < length; i++) {
            char c = sequence.charAt(i);
            if (c == 'A') {
                count[0]++;
            } else if (c == 'C') {
                count[1]++;
            } else if (c == 'G') {
                count[2]++;
            } else if (c == 'T') {
                count[3]++;
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int S = Integer.parseInt(stringTokenizer.nextToken());
        int P = Integer.parseInt(stringTokenizer.nextToken());
        int answer = 0;
        String dna = bufferedReader.readLine();

        int[] dnaNum = countDNA(dna, P);

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int[] wordNum = new int[4];
        for (int i = 0; i < 4; i++) {
            wordNum[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        for (int i = 0; i + P <= S; i++) {
            if (dnaNum[0] >= wordNum[0] && dnaNum[1] >= wordNum[1]
                    && dnaNum[2] >= wordNum[2] && dnaNum[3] >= wordNum[3]) {
                answer++;
            }
            if (i + P < S) {
                char leaving = dna.charAt(i);
                char entering = dna.charAt(i + P);

                if (leaving == 'A') {
                    dnaNum[0]--;
                } else if (leaving == 'C') {
                    dnaNum[1]--;
                } else if (leaving == 'G') {
                    dnaNum[2]--;
                } else if (leaving == 'T') {
                    dnaNum[3]--;
                }

                if (entering == 'A') {
                    dnaNum[0]++;
                } else if (entering == 'C') {
                    dnaNum[1]++;
                } else if (entering == 'G') {
                    dnaNum[2]++;
                } else if (entering == 'T') {
                    dnaNum[3]++;
                }
            }
        }
        System.out.println(answer);
    }
}