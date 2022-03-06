package cn.com.yunweizhan.offer;

import cn.com.yunweizhan.BaseTests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Offer48Tests extends BaseTests {
	private Offer48 offer48 = new Offer48();

	@Test
	void lengthOfLongestSubstring() {
		String test = "abcabcbb";
		System.out.println(offer48.lengthOfLongestSubstring(test));
		String test1 = "bbbbb";
		System.out.println(offer48.lengthOfLongestSubstring(test1));
		String test2 = "pwwkew";
		System.out.println(offer48.lengthOfLongestSubstring(test2));
	}
}