package cn.com.yunweizhan.medium;

public class Solution915 {
	public int partitionDisjoint(int[] nums) {
		int max = nums[0], leftMax = nums[0], pos = 0;
		for (int i = 0; i < nums.length; i++) {
			max = Math.max(max, nums[i]);
			if (nums[i] >= leftMax)
				continue;
			leftMax = max;
			pos = i;
		}

		return pos + 1;
	}

	public static void main(String[] args) {
		Solution915 solution915 = new Solution915();
		int[] nums = {5, 0, 3, 8, 6};
		System.out.println(solution915.partitionDisjoint(nums));
	}
}
