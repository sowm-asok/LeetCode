package com.company.leetcode;

import static java.lang.Math.abs;
import static java.lang.Math.min;

public class ShortestWordDistance {

    public static void main(String[] args) {
        String[] words = {"practice", "makes", "perfect", "coding", "makes"};

        int result = shortestDistance(words, "coding", "practice");
//        int result = shortestDistance(words, "makes", "coding");
        System.out.println(result);
    }

    private static int shortestDistance(String[] words, String word1, String word2) {
        int index1 = -1;
        int index2 = -1;
        int distance = Integer.MAX_VALUE;

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word1)) {
                index1 = i;
            }
            if (words[i].equals(word2)) {
                index2 = i;
            }
            if (index1 != -1 && index2 != -1) {
                distance = min(distance, abs(index1 - index2));
            }
        }
        return distance;
    }
}
