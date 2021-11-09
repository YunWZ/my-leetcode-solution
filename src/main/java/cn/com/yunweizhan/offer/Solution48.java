package cn.com.yunweizhan.offer;

import java.util.HashMap;
import java.util.Map;

public class Solution48 {
	public int lengthOfLongestSubstring(String s) {
		int length = s.length();
		if (length <= 1)
			return length;

		Map<Character, Integer> repeatChar = new HashMap<>();
		int maxSubstring = 0, startIndex = -1, currentLength = 0;
		for (int i = 0; i < length; i++) {
			char currentChar = s.charAt(i);
			if (repeatChar.containsKey(currentChar)) {
				startIndex = Math.max(startIndex, repeatChar.get(currentChar));
				currentLength = i - startIndex;
			}
			else {
				currentLength++;
			}

			repeatChar.put(currentChar, i);
			maxSubstring = Math.max(maxSubstring, currentLength);
		}

		return maxSubstring;
	}

	public static void main(String[] args) {
		test1();
		test2();
		test3();
		test4();
	}

	private static void test1() {
		Solution48 solution48 = new Solution48();
		String s = "abcabcbb";
		System.out.println(solution48.lengthOfLongestSubstring(s));
	}

	private static void test2() {
		Solution48 solution48 = new Solution48();
		String s = "bbbbb";
		System.out.println(solution48.lengthOfLongestSubstring(s));
	}

	private static void test3() {
		Solution48 solution48 = new Solution48();
		String s = "pwwkew";
		System.out.println(solution48.lengthOfLongestSubstring(s));
	}

	private static void test4() {
		Solution48 solution48 = new Solution48();
		String s = "abba";
		System.out.println(solution48.lengthOfLongestSubstring(s));
	}
}
