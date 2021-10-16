package cn.com.yunweizhan.offer;

import cn.com.yunweizhan.common.entity.TreeNode;

public class Soluiton28 {
	public boolean isSymmetric(TreeNode root) {
		return root == null || recur(root.left, root.right);
	}

	private boolean recur(TreeNode left, TreeNode right) {
		if (left == null && right == null)
			return true;
		if (left == null || right == null || left.val != right.val)
			return false;

		return recur(left.left, right.right) && recur(left.right, right.left);
	}
}
