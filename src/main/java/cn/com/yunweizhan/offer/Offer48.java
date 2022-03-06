package cn.com.yunweizhan.offer;

import java.util.HashMap;
import java.util.Map;

/**
 * 最长不含重复字符的子字符串
 *
 */
public class Offer48 {
	public int lengthOfLongestSubstring(String s) {
		Map<Character, Integer> charMap = new HashMap<>();
		int leftIndex = -1, ans = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int index = charMap.getOrDefault(c, 0);
			if (index < leftIndex) {
				ans = Math.max(ans, i - leftIndex +1);
			}
			else {
				leftIndex = index + 1;
			}
			charMap.put(c, i);
		}

		return ans;
	}
}
