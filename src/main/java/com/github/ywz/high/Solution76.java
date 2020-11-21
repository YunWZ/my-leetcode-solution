package com.github.ywz.high;

import java.util.HashMap;
import java.util.Map;

/**
 * 给你一个字符串 S、一个字符串 T，请在字符串 S 里面找出：包含 T 所有字符的最小子串。
 * <p>
 * 示例：
 * 输入: S = "ADOBECODEBANC", T = "ABC"
 * 输出: "BANC"
 * <p>
 * 说明：
 * <p>
 * 如果 S 中不存这样的子串，则返回空字符串 ""。
 * 如果 S 中存在这样的子串，我们保证它是唯一的答案。
 * </p>
 */
public class Solution76 {
    public String minWindow(String s, String t) {
        int left = 0, right = 0, valid = 0, len = Integer.MAX_VALUE, startIndex = 0;
        Map<Character, Integer> nees = new HashMap<>(), windows = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            nees.put(t.charAt(i), nees.getOrDefault(t.charAt(i), 0) + 1);
        }

        while (right < s.length()) {
            char c = s.charAt(right++);
            if (nees.containsKey(c)) {
                windows.put(c, windows.getOrDefault(c, 0) + 1);
                if (nees.get(c).equals(windows.get(c)))
                    valid++;
            }

            while (valid == nees.size()) {
                if (len > (right - left)) {
                    len = right - left;
                    startIndex = left;
                }

                char c1 = s.charAt(left);
                left++;

                if (nees.containsKey(c1)) {
                    if (nees.get(c1).equals(windows.get(c1))) {
                        valid--;
                    }
                    windows.put(c1, windows.get(c1) - 1);
                }
            }
        }

        return len == Integer.MAX_VALUE ? "" : s.substring(startIndex, len + startIndex);
    }

    public static void main(String[] args) {
        Solution76 solution76 = new Solution76();
        String s = "a";
        String t = "aa";
        System.out.println(solution76.minWindow(s, t));
    }
}
