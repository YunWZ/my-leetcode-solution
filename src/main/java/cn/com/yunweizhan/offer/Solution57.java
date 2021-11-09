package cn.com.yunweizhan.offer;

public class Solution57 {
	public int[] twoSum(int[] nums, int target) {
		int start = 0, end = nums.length - 1;
		while (start < end) {
			int other = target - nums[start];
			if (other == nums[end])
				return new int[] {nums[start], nums[end]};
			else if (other < nums[end]) end--;
			else start++;
		}

		return new int[] {};
	}

	public static void main(String[] args) {
		int[] nums = {2, 7, 11, 15};
		int target = 9;

		Solution57 solution57 = new Solution57();
		int[] x = solution57.twoSum(nums, target);
		System.out.println(x);
	}
}
