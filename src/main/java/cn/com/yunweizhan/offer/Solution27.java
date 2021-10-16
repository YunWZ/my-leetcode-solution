package cn.com.yunweizhan.offer;

import cn.com.yunweizhan.common.entity.TreeNode;

public class Solution27 {
	public TreeNode mirrorTree(TreeNode root) {
		if (root == null) {
			return null;
		}

		TreeNode left = root.left;
		root.left = mirrorTree(root.right);
		root.right = mirrorTree(left);

		return root;
	}
}
