package cn.com.yunweizhan.middle;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定两个字符串 s1 和 s2，写一个函数来判断 s2 是否包含 s1 的排列。
 * <p>
 * 换句话说，第一个字符串的排列之一是第二个字符串的子串。
 * <p>
 * 示例1:
 * <p>
 * 输入: s1 = "ab" s2 = "eidbaooo"
 * 输出: True
 * 解释: s2 包含 s1 的排列之一 ("ba").
 * </p>
 * 示例2:
 * <p>
 * 输入: s1= "ab" s2 = "eidboaoo"
 * 输出: False
 */
public class Solution567 {
    public boolean checkInclusion(String s1, String s2) {
        boolean ans = false;
        Map<Character, Integer> needs = new HashMap<>(), windows = new HashMap<>();
        int left = 0, right = 0, valid = 0;
        int len = s1.length();
        for (int i = 0; i < len; i++) {
            needs.put(s1.charAt(i), needs.getOrDefault(s1.charAt(i), 0) + 1);
        }

        while (right < s2.length()) {
            char c = s2.charAt(right++);
            //扩充窗口时
            if (needs.containsKey(c)) {
                windows.put(c, windows.getOrDefault(c, 0) + 1);
                if (needs.get(c).equals(windows.get(c))) {
                    valid++;
                }
            } else {
                left = right;
                windows.clear();
                valid = 0;
            }

            while (right - left == len) {
                if (valid == needs.size()) {
                    return true;
                }
                char c1 = s2.charAt(left++);
                if (needs.containsKey(c1)) {
                    if (needs.get(c1).equals(windows.get(c1))) {
                        valid--;
                    }
                    windows.put(c1, windows.get(c1) - 1);
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        String s1 = "hello", s2 = "ooolleoooleh";
        Solution567 solution567 = new Solution567();
        System.out.println(solution567.checkInclusion(s1, s2));
    }
}
