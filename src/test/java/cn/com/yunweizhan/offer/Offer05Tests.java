package cn.com.yunweizhan.offer;

import cn.com.yunweizhan.BaseTests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Weizhan▪Yun
 * @date 2022/4/5 15:12
 */
class Offer05Tests extends BaseTests {
	private Offer05 instance = new Offer05();

	@Test
	void replaceSpace() {
		test("We are happy.", "We%20are%20happy.");
	}

	private void test(String s, String expected) {
		assertEquals(expected, instance.replaceSpace(s));
	}
}