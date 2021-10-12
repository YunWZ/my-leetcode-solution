package cn.com.yunweizhan.offer;

public class Solution53 {
	public int search(int[] nums, int target) {
		int count = 0;
		for (int num : nums) {
			if (num == target)
				count++;
			else if (num > target)
				break;
		}

		return count;
	}

	public static void main(String[] args) {
		int[] nums = {1};
		int target = 1;

		Solution53 solution53 = new Solution53();
		int search = solution53.search(nums, target);
		System.out.println(search);
	}
}
