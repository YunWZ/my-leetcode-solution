package cn.com.yunweizhan.medium;

/**
 * 33. 搜索旋转排序数组
 * @author Weizhan▪Yun
 * @date 2022/3/31 17:56
 */
public class Solution33 {

	public int search(int[] nums, int target) {
		int lo = 0, hi = nums.length - 1;

		while (lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			if (nums[mid] == target) {
				return mid;
			}

			if (nums[lo] <= nums[mid]) {
				if (nums[lo] <= target && target < nums[mid]) {
					hi = mid - 1;
				}
				else {
					lo = mid + 1;
				}
			}
			else {
				if (nums[hi] >= target && target > nums[mid]) {
					lo = mid + 1;
				}
				else {
					hi = mid - 1;
				}
			}
		}

		return -1;
	}

}
