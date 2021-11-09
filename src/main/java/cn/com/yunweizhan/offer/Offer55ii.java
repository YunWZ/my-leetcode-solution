package cn.com.yunweizhan.offer;

import cn.com.yunweizhan.common.entity.TreeNode;

public class Offer55ii {
	public boolean isBalanced(TreeNode root) {
		return depth(root) != -1;
	}

	private int depth(TreeNode root) {
		if (root == null)
			return 0;

		int ld = depth(root.left);
		if (ld == -1) return -1;

		int rd = depth(root.right);
		if (rd == -1) return -1;

		if (Math.abs(ld - rd) > 1)
			return -1;

		return Math.max(ld, rd) + 1;
	}
}
