package cn.com.yunweizhan.medium;

import cn.com.yunweizhan.common.entity.TreeNode;

public class Solution1302 {
	int maxLevel = -1;
	int sum = 0;

	public int deepestLeavesSum(TreeNode root) {
		if (root == null) {
			return 0;
		}
		if (root.left == null && root.right == null) {
			return root.val;
		}

		deepestLeavesSum(root, 0);
		return sum;
	}

	private void deepestLeavesSum(TreeNode root, int currentLevel) {
		if (root.left == null && root.right == null) {
			if (currentLevel > maxLevel) {
				maxLevel = currentLevel;
				sum = root.val;
			}
			else if (currentLevel == maxLevel) {
				sum += root.val;
			}
		}

		if (root.left != null) {
			deepestLeavesSum(root.left, currentLevel + 1);
		}
		if (root.right != null) {
			deepestLeavesSum(root.right, currentLevel + 1);
		}
	}
}
