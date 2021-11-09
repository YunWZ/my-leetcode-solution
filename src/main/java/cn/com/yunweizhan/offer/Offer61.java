package cn.com.yunweizhan.offer;

import java.util.HashSet;
import java.util.Set;

/**
 * 从若干副扑克牌中随机抽 5 张牌，判断是不是一个顺子，即这5张牌是不是连续的。2～10为数字本身，A为1，J为11，Q为12，K为13，而大、小王为 0 ，可以看成任意数字。A 不能视为 14。
 *
 */
public class Offer61 {
	public boolean isStraight(int[] nums) {
		Set<Integer> repeat = new HashSet<>();
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		for (int num : nums) {
			if (num == 0)
				continue;
			if (!repeat.add(num)) {
				return false;
			}

			min = Math.min(min, num);
			max = Math.max(max, num);
		}

		return max - min < 5;
	}
}
