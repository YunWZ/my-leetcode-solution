package cn.com.yunweizhan.offer;

import cn.com.yunweizhan.common.entity.Node;

/**
 * 二叉搜索树与双向链表
 */
public class Solution36 {
	Node pre, head;

	public Node treeToDoublyList(Node root) {
		if (root == null) {
			return null;
		}

		dfs(root);

		head.left = pre;
		pre.right = head;

		return head;
	}

	private void dfs(Node root) {
		if (root == null)
			return;

		dfs(root.left);
		if (pre != null)
			pre.right = root;
		else head = root;

		root.left = pre;
		pre = root;
		dfs(root.right);
	}
}
