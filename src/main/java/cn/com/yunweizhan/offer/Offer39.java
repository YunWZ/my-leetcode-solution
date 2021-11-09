package cn.com.yunweizhan.offer;

import java.util.HashMap;

/**
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 *
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 */
public class Offer39 {
	public int majorityElement(int[] nums) {
		HashMap<Integer, Integer> repeat = new HashMap<>(nums.length / 2);
		int maxNum = 0, maxRepeat = 0, threshold = nums.length / 2 + 1;
		for (int num : nums) {
			Integer numRepeat = repeat.getOrDefault(num, 0) + 1;
			repeat.put(num, numRepeat);
			if (numRepeat > maxRepeat) {
				maxNum = num;
				maxRepeat = numRepeat;
			}
			if (maxRepeat >= threshold)
				break;
		}
		return maxNum;
	}
}
