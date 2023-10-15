package cn.com.yunweizhan.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1880Tests {
	static Solution1880 s = new Solution1880();

	@Test
	public void test() {
		String firstWord = "acb", secondWord = "cba", targetWord = "cdb";
		s.isSumEqual(firstWord, secondWord, targetWord);
	}	@Test
	public void test2() {
		String firstWord = "aaa", secondWord = "a", targetWord = "aaaa";
		s.isSumEqual(firstWord, secondWord, targetWord);
	}

}
