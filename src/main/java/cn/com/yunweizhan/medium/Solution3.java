package cn.com.yunweizhan.medium;

import java.util.HashMap;

public class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        int length = s.length();
        if (length == 0 || length == 1) {
            return length;
        }
        HashMap<Character, Integer> position = new HashMap<>(length);
        int right = 0, ans = 0, left = 0;
        while (right < s.length()) {
            char c = s.charAt(right++);
            Integer cIndex = position.getOrDefault(c, -1);
            if (cIndex < left) {
                ans = Math.max(ans, right - left);
            } else {
                left = cIndex + 1;
            }
            position.put(c, right - 1);
        }

        return ans;
    }

    public static void main(String[] args) {
        String s = "pwwkew";
        Solution3 solution3 = new Solution3();
        System.out.println(solution3.lengthOfLongestSubstring(s));
    }
}
