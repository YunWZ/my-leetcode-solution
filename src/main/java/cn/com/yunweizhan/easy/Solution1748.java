package cn.com.yunweizhan.easy;

public class Solution1748 {
	public int sumOfUnique(int[] nums) {
		int[] numsCache = new int[101];
		int sum = 0;
		for (int num : nums) {
			int currentSize;
			if ((currentSize = numsCache[num]++) == 0)
				sum += num;
			else if (currentSize == 1)
				sum -= num;
		}

		return sum;
	}
}
