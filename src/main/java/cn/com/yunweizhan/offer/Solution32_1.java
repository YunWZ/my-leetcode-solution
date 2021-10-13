package cn.com.yunweizhan.offer;

import java.util.LinkedList;
import java.util.List;

import cn.com.yunweizhan.common.entity.TreeNode;

public class Solution32_1 {
	public int[] levelOrder(TreeNode root) {
		List<Integer> res = new LinkedList<>();
		wsf(res, root);

		int[] result = new int[res.size()];
		int index = 0;
		for (Integer re : res) {
			result[index++] = re;
		}

		return result;
	}

	private void wsf(List<Integer> res, TreeNode... root) {
		if (root == null || root.length == 0) {
			return;
		}
		List<TreeNode> child = new LinkedList<>();
		for (TreeNode treeNode : root) {
			if (treeNode == null) {
				continue;
			}
			res.add(treeNode.val);
			if (treeNode.left != null) {
				child.add(treeNode.left);
			}
			if (treeNode.right != null) {
				child.add(treeNode.right);
			}
		}

		wsf(res, child.toArray(new TreeNode[0]));
	}

	public static void main(String[] args) {
		Solution32_1 solution32_1 = new Solution32_1();
		TreeNode treeNode1 = new TreeNode(15, null, null);
		TreeNode treeNode2 = new TreeNode(7, null, null);

		TreeNode treeNode3 = new TreeNode(20, treeNode1, treeNode2);
		TreeNode treeNode4 = new TreeNode(9, null, null);
		TreeNode treeNode5 = new TreeNode(3, treeNode4, treeNode3);

		int[] result = solution32_1.levelOrder(treeNode5);
		System.out.println(result);
	}
}
