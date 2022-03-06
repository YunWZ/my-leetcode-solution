package com.github.ywz.middle;

import java.util.HashMap;

public class Solution791 {
    HashMap<Character, Integer> order;

    public String customSortString(String S, String T) {
        order = new HashMap<>(S.length());
        int i = 0;
        for (char c : S.toCharArray()) {
            order.put(c, i++);
        }

        Character[] o = new Character[T.length()];
        for (int j = 0; j < T.length(); j++) {
            insert(o, j, T.charAt(j));
        }
        StringBuilder stringBuilder = new StringBuilder(o.length);
        for (Character character : o) {
            stringBuilder.append(character);
        }

        return stringBuilder.toString();
    }

    private void insert(Character[] o, int j, char c) {
        o[j] = c;
        for (int i = j; i > 0; i--) {
            if (order.getOrDefault(o[i], Integer.MAX_VALUE) < order.getOrDefault(o[i - 1], Integer.MAX_VALUE)) {
                Character temp = o[i];
                o[i] = o[i - 1];
                o[i - 1] = temp;
            } else break;
        }
    }

    public static void main(String[] args) {
        String S = "cba",
                T = "abcd";
        Solution791 solution791 = new Solution791();
        System.out.println(solution791.customSortString(S, T));
    }
}
