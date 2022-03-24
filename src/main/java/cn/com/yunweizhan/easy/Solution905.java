package cn.com.yunweizhan.easy;

/**
 * @author Weizhan▪Yun
 * @date 2022/3/22 18:08
 */
public class Solution905 {

	public int[] sortArrayByParity(int[] nums) {
		if (nums.length < 1) {
			return nums;
		}
		int oddIndex = 0, evenIndex = nums.length - 1;
		while (oddIndex < evenIndex) {
			while (oddIndex < evenIndex && nums[oddIndex] % 2 == 0) {
				oddIndex++;
			}
			while (evenIndex > oddIndex && nums[evenIndex] % 2 == 1) {
				evenIndex--;
			}
			int temp = nums[oddIndex];
			nums[oddIndex] = nums[evenIndex];
			nums[evenIndex] = temp;
			oddIndex++;
			evenIndex--;
		}

		return nums;
	}
}
