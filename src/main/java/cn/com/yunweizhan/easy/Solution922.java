package cn.com.yunweizhan.easy;

public class Solution922 {
	public int[] sortArrayByParityII(int[] nums) {
		if (nums.length < 1)
			return nums;
		int oddIndex = 1;
		for (int evenIndex = 0; evenIndex < nums.length; evenIndex += 2) {
			if ((nums[evenIndex] & 1) == 1) {
				while ((nums[oddIndex] & 1) == 1)
					oddIndex += 2;
				swap(nums, evenIndex, oddIndex);
			}
		}
		return nums;
	}

	private void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}
