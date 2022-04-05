package cn.com.yunweizhan.interview;

import cn.com.yunweizhan.BaseTests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Weizhan▪Yun
 * @date 2022/4/5 15:48
 */
class Solution10_02Tests extends BaseTests {
	private Solution10_02 instance = new Solution10_02();

	@Test
	void groupAnagrams() {
		System.out.println(instance.groupAnagrams(new String[] {"eat", "tea", "tan", "ate", "nat", "bat"}));
	}
}