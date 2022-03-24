package cn.com.yunweizhan.medium;

import cn.com.yunweizhan.BaseTests;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Weizhan▪Yun
 * @date 2022/3/22 22:07
 */
class Solution1079Tests extends BaseTests {

	private static final Solution1079 instance = new Solution1079();

	@Test
	void numTilePossibilities() {
		System.out.println(instance.numTilePossibilities("AAB"));
	}	@Test
	void numTilePossibilities2() {
		System.out.println(instance.numTilePossibilities("AAABBC"));
	}
}