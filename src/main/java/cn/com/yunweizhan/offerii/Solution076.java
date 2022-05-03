package cn.com.yunweizhan.offerii;

/**
 * 数组中的第 k 大的数字
 *
 * 给定整数数组 nums 和整数 k，请返回数组中第 k 个最大的元素。
 *
 * @author Weizhan▪Yun
 * @date 2022/5/3 17:47
 */
public class Solution076 {
	public int findKthLargest(int[] nums, int k) {
		if (k > nums.length) {
			throw new IllegalArgumentException("k must be less than or equals nums length.");
		}

		initHeap(nums, k);

		for (int i = k + 1; i <= nums.length; i++) {
			if (nums[0] < nums[i - 1]) {
				nums[0] = nums[i - 1];
				sink(nums, 1, k);
			}
		}

		return nums[0];
	}

	private void initHeap(int[] nums, int k) {
		for (int i = k / 2; i >= 1; i--) {
			sink(nums, i, k);
		}
	}

	/**
	 * 下沉
	 * @param nums 堆数组
	 * @param root 根节点(从1开始)
	 * @param n 数组长度
	 */
	private void sink(int[] nums, int root, int n) {
		while (2 * root <= n) {
			int child = 2 * root;
			if (child < n && nums[child - 1] > nums[child]) {
				child = child + 1;
			}

			if (nums[root - 1] < nums[child - 1]) {
				break;
			}

			int temp = nums[root - 1];
			nums[root - 1] = nums[child - 1];
			nums[child - 1] = temp;
			root = child;
		}
	}
}
