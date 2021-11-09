package cn.com.yunweizhan.offer;

import java.util.StringJoiner;

public class Solution58_1 {
	public String reverseWords(String s) {
		s = s.trim();
		String[] s1 = s.split("\\s+");
		StringJoiner joiner = new StringJoiner(" ", "", "");
		for (int i = s1.length - 1; i >= 0; i--) {
			joiner.add(s1[i]);
		}
		return joiner.toString();
	}

	public static void main(String[] args) {
		test1();
		test2();
	}

	private static void test1() {
		Solution58_1 solution58_1 = new Solution58_1();
		String s = "      ";
		System.out.println(solution58_1.reverseWords(s));
	}

	private static void test2() {
		Solution58_1 solution58_1 = new Solution58_1();
		String s = "the sky is blue";
		System.out.println(solution58_1.reverseWords(s));
	}
}
