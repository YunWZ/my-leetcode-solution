package cn.com.yunweizhan.offer;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import cn.com.yunweizhan.common.entity.TreeNode;

public class Solution32_3 {
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> res = new LinkedList<>();
		if (root == null) {
			return res;
		}

		wsf(res, Collections.singletonList(root));

		return res;
	}

	private void wsf(List<List<Integer>> res, List<TreeNode> treeNodes) {
		List<Integer> currentLevenVal = new LinkedList<>();
		if (!treeNodes.isEmpty()) {
			List<TreeNode> nextLevel = new LinkedList<>();

			//如果是顺序
			if ((res.size() & 1) == 0) {
				for (TreeNode treeNode : treeNodes) {
					currentLevenVal.add(treeNode.val);

					if (treeNode.left != null)
						nextLevel.add(treeNode.left);
					if (treeNode.right != null) {
						nextLevel.add(treeNode.right);
					}
				}
			}
			else {
				for (TreeNode treeNode : treeNodes) {
					currentLevenVal.add(0, treeNode.val);

					if (treeNode.left != null)
						nextLevel.add(treeNode.left);
					if (treeNode.right != null) {
						nextLevel.add(treeNode.right);
					}
				}
			}

			res.add(currentLevenVal);

			wsf(res, nextLevel);
		}
	}


	public static void main(String[] args) {
		test1();
		test2();
	}

	public static void test2() {
		Solution32_3 solution32_3 = new Solution32_3();
		TreeNode treeNode1 = new TreeNode(4, null, null);
		TreeNode treeNode2 = new TreeNode(5, null, null);

		TreeNode treeNode3 = new TreeNode(2, treeNode1, null);
		TreeNode treeNode4 = new TreeNode(3, null, treeNode2);
		TreeNode treeNode5 = new TreeNode(1, treeNode3, treeNode4);

		List<List<Integer>> result = solution32_3.levelOrder(treeNode5);
		System.out.println(result);
	}

	public static void test1() {
		Solution32_3 solution32_3 = new Solution32_3();
		TreeNode treeNode1 = new TreeNode(15, null, null);
		TreeNode treeNode2 = new TreeNode(7, null, null);

		TreeNode treeNode3 = new TreeNode(20, treeNode1, treeNode2);
		TreeNode treeNode4 = new TreeNode(9, null, null);
		TreeNode treeNode5 = new TreeNode(3, treeNode4, treeNode3);

		List<List<Integer>> result = solution32_3.levelOrder(treeNode5);
		System.out.println(result);
	}
}
