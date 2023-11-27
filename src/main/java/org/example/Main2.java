package org.example;

import java.util.Arrays;

public class Main2 {
    static int[] dice2;
    static int[] aDice;
    static int[] bDice;
    static int[] aWinCount;
    static int total;

    public static void main(String[] args) {
        int[][] dices = {{1, 2, 3, 4, 5, 6}, {3, 3, 3, 3, 4, 4}, {1, 3, 3, 4, 4, 4}, {1, 1, 4, 4, 5, 5}};
        int n = dices.length;
//        dice2 = new int[n];
        aDice = new int[n / 2];
        bDice = new int[n / 2];
        aWinCount = new int[n];
        total = 0;

        generateDiceCombination(dices, 0, 0);

        int[] result = getOptimalDiceNumbers();
        System.out.println(Arrays.toString(result));
    }

    static void generateDiceCombination(int[][] dices, int diceIndex, int aIndex) {
        if (diceIndex == dices.length) {
            calculateScore(dices);
            return;
        }

        if (aIndex < aDice.length) {
            aDice[aIndex] = diceIndex;  // 주사위 번호는 1부터 시작하므로 인덱스에 1을 더해줍니다.
            generateDiceCombination(dices, diceIndex + 1, aIndex + 1);
        }

        if (diceIndex - aIndex < bDice.length) {
            bDice[diceIndex - aIndex] = diceIndex;  // 주사위 번호는 1부터 시작하므로 인덱스에 1을 더해줍니다.
            generateDiceCombination(dices, diceIndex + 1, aIndex);
        }
    }

    static void calculateScore(int[][] dices) {
        int aScore = 0;
        int bScore = 0;

        for (int i = 0; i < aDice.length; i++) {
            aScore += Arrays.stream(dices[aDice[i]]).sum();
        }

        for (int i = 0; i < bDice.length; i++) {
            bScore += Arrays.stream(dices[bDice[i]]).sum();
        }

        if (aScore > bScore) {
            for (int i = 0; i < aDice.length; i++) {
                aWinCount[aDice[i]]++;
            }
        }

        total++;
    }

    static int[] getOptimalDiceNumbers() {
        int maxIndex = 0;
        for (int i = 1; i < aWinCount.length; i++) {
            if (aWinCount[i] > aWinCount[maxIndex]) {
                maxIndex = i;
            }
        }

        int[] result = new int[aDice.length];
        int index = 0;
        for (int i = 0; i < aDice.length; i++) {
            if (aDice[i] == maxIndex) {
                result[index] = i + 1;
                index++;
            }
        }

        return result;
    }
}