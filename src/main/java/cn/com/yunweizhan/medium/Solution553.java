package cn.com.yunweizhan.medium;

/**
 * @author Weizhan▪Yun
 * @date 2022/6/3 21:04
 */
public class Solution553 {
	public String optimalDivision(int[] nums) {
		if (nums.length == 1) {
			return String.valueOf(nums[0]);
		}
		else if (nums.length == 2) {
			return nums[0] + "/" + nums[1];
		}

		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(nums[0]).append("/").append("(");
		boolean first = true;
		for (int i = 1; i < nums.length; i++) {
			if (first) {
				first = false;
			}
			else {
				stringBuilder.append("/");
			}

			stringBuilder.append(nums[i]);
		}
		stringBuilder.append(")");
		return stringBuilder.toString();
	}
}
