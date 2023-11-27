package org.example;

import java.util.*;

public class Main {

    public static int solution(String[] friends, String[] gifts) {
        Map<String, Integer> giftIndex = new HashMap<>();
        Map<String, Map<String, Integer>> giftHistory = new HashMap<>();

        for (String friend : friends) {
            giftIndex.put(friend, 0);
            giftHistory.put(friend, new HashMap<>());
        }

        for (String gift : gifts) {
            String[] parts = gift.split(" ");
            String giver = parts[0];
            String receiver = parts[1];

            giftIndex.put(giver, giftIndex.get(giver) - 1);
            giftIndex.put(receiver, giftIndex.get(receiver) + 1);

            giftHistory.get(giver).put(receiver, giftHistory.get(giver).getOrDefault(receiver, 0) + 1);
        }

        Map<String, Integer> nextMonthGifts = new HashMap<>();
        for (String friendA : friends) {
            for (String friendB : friends) {
                if (!friendA.equals(friendB)) {
                    int aToB = giftHistory.get(friendA).getOrDefault(friendB, 0);
                    int bToA = giftHistory.get(friendB).getOrDefault(friendA, 0);
                    if (aToB > bToA || (aToB == bToA && giftIndex.get(friendA) < giftIndex.get(friendB)))
                        nextMonthGifts.put(friendA, nextMonthGifts.getOrDefault(friendA, 0) + 1);
                }
            }
        }

        if (nextMonthGifts.isEmpty()) return 0;
        return Collections.max(nextMonthGifts.values());
    }

    public static void main(String[] args) {
        String[] friends = {"muzi", "ryan", "frodo", "neo"};
        String[] gifts = {"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"};

        int result = solution(friends, gifts);
        System.out.println("가장 많은 선물을 받을 친구가 받을 선물의 수: " + result);
    }
}