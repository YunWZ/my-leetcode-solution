package cn.com.yunweizhan.medium;

import java.util.HashSet;
import java.util.Set;

/**
 * 数组中的 k-diff 数对
 * @author Weizhan▪Yun
 * @date 2022/5/12 13:47
 */
public class Solution532 {
	public int findPairs(int[] nums, int k) {
		/*
		 * |nums[i] - nums[j]| = k,因此nums[i] - nums[j] = +k 或者 nums[i] - nums[j] = -k  (k>=0).
		 * saw保存遍历过的数,ans保存k-diff中的最小值.
		 * 对于情况: nums[i] - nums[j] = +k, 最小值为nums[j],即nums[i]-k;
		 * 对应情况: nums[i] - nums[j] = -k, 最小值为nums[i].
		 */
		Set<Integer> saw = new HashSet<>(), ans = new HashSet<>();
		for (int num : nums) {
			//判断saw中是否存在nums[j],
			if (saw.contains(num - k)) {
				ans.add(num - k);
			}
			if (saw.contains(num + k)) {
				ans.add(num);
			}
			saw.add(num);
		}

		return ans.size();
	}
}
