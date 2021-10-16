package cn.com.yunweizhan.offer;

import cn.com.yunweizhan.common.entity.TreeNode;

public class Solution26 {
	public boolean isSubStructure(TreeNode A, TreeNode B) {
		return (A != null && B != null) && (recur(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B));
	}

	private boolean recur(TreeNode a, TreeNode b) {
		if (b == null) {
			return true;
		}
		if (a == null || a.val != b.val)
			return false;

		return recur(a.left, b.left) && recur(a.right, b.right);
	}

	public static void main(String[] args) {
		test1();
	}

	private static void test1() {
		TreeNode treeNode1 = new TreeNode(1, null, null);
		TreeNode treeNode2 = new TreeNode(2, null, null);
		TreeNode treeNode3 = new TreeNode(4, treeNode1, treeNode2);
		TreeNode treeNode4 = new TreeNode(5, null, null);
		TreeNode treeNode5 = new TreeNode(3, treeNode3, treeNode4);

		TreeNode treeNode6 = new TreeNode(1, null, null);
		TreeNode treeNode7 = new TreeNode(4, treeNode6, null);

		Solution26 solution26 = new Solution26();
		System.out.println(solution26.isSubStructure(treeNode5, treeNode7));
	}
}
