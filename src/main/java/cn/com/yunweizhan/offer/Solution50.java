package cn.com.yunweizhan.offer;

import java.util.Arrays;

public class Solution50 {
	public char firstUniqChar(String s) {
		if (s.length() == 0)
			return ' ';
		else if (s.length() == 1)
			return s.charAt(0);

		int[] chars = new int[26];
		Arrays.fill(chars, 0);
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int reIndex = c - 97;
			chars[reIndex] += 1;
		}
		for (int i = 0; i < s.length(); i++) {
			if (chars[s.charAt(i) - 97] == 1)
				return s.charAt(i);
		}

		return ' ';
	}

	public static void main(String[] args) {
		Solution50 solution50 = new Solution50();
		String test1 = "abaccdeff";
		String test2 = "";
		String test3 = "leetcode";
		String test4 = "";
		System.out.println(solution50.firstUniqChar(test1));
		System.out.println(solution50.firstUniqChar(test2));
		System.out.println(solution50.firstUniqChar(test3));
		System.out.println(solution50.firstUniqChar(test4));
	}
}
