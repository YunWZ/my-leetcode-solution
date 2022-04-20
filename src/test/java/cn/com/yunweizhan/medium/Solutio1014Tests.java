package cn.com.yunweizhan.medium;

import cn.com.yunweizhan.BaseTests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Weizhan▪Yun
 * @date 2022/4/20 10:24
 */
class Solutio1014Tests extends BaseTests {
	public static final Solutio1014 instance = new Solutio1014();

	@Test
	void maxScoreSightseeingPair() {
		assertEquals(11, instance.maxScoreSightseeingPair(new int[] {8, 1, 5, 2, 6}));
		assertEquals(2, instance.maxScoreSightseeingPair(new int[] {1, 2}));
	}
}