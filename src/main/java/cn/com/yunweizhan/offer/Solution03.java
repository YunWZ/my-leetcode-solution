package cn.com.yunweizhan.offer;

import java.util.BitSet;

public class Solution03 {
	public int findRepeatNumber(int[] nums) {
		BitSet bitSet = new BitSet(100000);
		for (int num : nums) {
			if (bitSet.get(num))
				return num;

			bitSet.set(num);
		}

		return 1;
	}
}
