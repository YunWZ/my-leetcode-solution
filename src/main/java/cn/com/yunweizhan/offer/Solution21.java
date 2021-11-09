package cn.com.yunweizhan.offer;

public class Solution21 {
	public int[] exchange(int[] nums) {
		int start = 0, end = nums.length - 1;
		while (start < end) {
			if ((nums[start] & 1) != 0)
				start++;
			else {
				int temp = nums[end];
				nums[end--] = nums[start];
				nums[start] = temp;
			}
		}

		return nums;
	}
}
