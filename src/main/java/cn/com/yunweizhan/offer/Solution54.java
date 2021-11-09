package cn.com.yunweizhan.offer;

import cn.com.yunweizhan.common.entity.TreeNode;

/**
 * 二叉搜索树的第k大节点
 */
public class Solution54 {
	int res, k;

	public int kthLargest(TreeNode root, int k) {
		this.k = k;
		dfs(root);

		return res;
	}

	private void dfs(TreeNode root) {
		if (root.right != null)
			dfs(root.right);

		if (k-- == 1) {
			res = root.val;
			return;
		}

		if (root.left != null)
			dfs(root.left);
	}

}
