package cn.com.yunweizhan.medium;

import cn.com.yunweizhan.BaseTests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution935Tests extends BaseTests {
	private Solution935 solution935 = new Solution935();

	@Test
	void knightDialer() {
		System.out.println(solution935.knightDialer(1));
		System.out.println(solution935.knightDialer(2));
		System.out.println(solution935.knightDialer(3131));
	}
}