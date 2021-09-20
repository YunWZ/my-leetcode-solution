package cn.com.yunweizhan.medium;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * 给定一个字符串 s 和一个非空字符串 p，找到 s 中所有是 p 的字母异位词的子串，返回这些子串的起始索引。
 * <p>
 * 字符串只包含小写英文字母，并且字符串 s 和 p 的长度都不超过 20100。
 * <p>
 * 说明：
 * <p>
 * 字母异位词指字母相同，但排列不同的字符串。
 * 不考虑答案输出的顺序。
 * <p>
 */
public class Solution438 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new LinkedList<>();
        int left = 0, right = 0, valid = 0;
        Map<Character, Integer> needs = new HashMap<>(), windows = new HashMap<>();
        int len = p.length();
        for (int i = 0; i < len; i++) {
            needs.put(p.charAt(i), needs.getOrDefault(p.charAt(i), 0) + 1);
        }
        while (right < s.length()) {
            char c = s.charAt(right++);
            if (needs.containsKey(c)) {
                windows.put(c, windows.getOrDefault(c, 0) + 1);
                if (needs.get(c).equals(windows.get(c))) {
                    valid++;
                }
            } else {
                left = right;
                valid = 0;
                windows.clear();
            }

            while (right - left == len) {
                if (valid == needs.size()) {
                    ans.add(left);
                }
                char c1 = s.charAt(left++);

                if (needs.get(c1).equals(windows.get(c1))) {
                    valid--;
                }

                windows.put(c1, windows.get(c1) - 1);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution438 solution438 = new Solution438();
        String s = "cbaebabacd", p = "abc";
        System.out.println(solution438.findAnagrams(s, p));
    }
}
