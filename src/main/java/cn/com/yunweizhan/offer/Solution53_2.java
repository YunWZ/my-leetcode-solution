package cn.com.yunweizhan.offer;

public class Solution53_2 {
	public int missingNumber(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (i != nums[i])
				return i;
		}
		return nums.length;
	}
}
