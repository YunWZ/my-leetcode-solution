package cn.com.yunweizhan.offer;

import cn.com.yunweizhan.common.entity.TreeNode;

public class Offer55i {
	public int maxDepth(TreeNode root) {
		if (root == null)
			return 0;

		return Math.max(1 + maxDepth(root.left), 1 + maxDepth(root.right));
	}
}
