package cn.com.yunweizhan.common.entity;

import java.util.LinkedList;
import java.util.List;
import java.util.StringJoiner;

public class TreeNode {
	public int val;
	public TreeNode left;
	public TreeNode right;

	public TreeNode(int x) {
		val = x;
	}

	public TreeNode(int x, TreeNode left, TreeNode right) {
		val = x;
		this.left = left;
		this.right = right;
	}

	@Override
	public String toString() {
		return Integer.toString(val);
	}

	public void print() {
		print(this, 0);
	}

	private void print(TreeNode treeNode, int deep) {
		for (int i = 0; i < deep; i++) {
			System.out.printf("-");
		}
		System.out.printf(" ");
		if (treeNode == null) {
			System.out.println("null");
			return;
		}
		System.out.println(treeNode);
		System.out.printf("left  ");
		print(treeNode.left, deep + 1);
		System.out.printf("right ");
		print(treeNode.right, deep + 1);
	}

	public void printWS() {
		List<TreeNode> list = new LinkedList<>();
		list.add(this);
		StringJoiner stringJoiner = new StringJoiner(",", "[", "]");
		while (!list.isEmpty()) {
			TreeNode node = list.remove(0);
			stringJoiner.add(Integer.toString(node.val));
			if (node.left != null) list.add(node.left);
			if (node.right != null) list.add(node.right);
		}
		System.out.println(stringJoiner);
	}
}
