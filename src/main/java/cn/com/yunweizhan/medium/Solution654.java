package cn.com.yunweizhan.medium;

import cn.com.yunweizhan.common.entity.TreeNode;

public class Solution654 {

	public TreeNode constructMaximumBinaryTree(int[] nums) {
		if (nums == null || nums.length == 0) {
			return null;
		}

		TreeNode root = null;
		for (int i = 0; i < nums.length; i++) {
			root = constructMaximumBinaryTree(root, nums[i]);
		}

		return root;
	}

	private TreeNode constructMaximumBinaryTree(TreeNode currentNode, int next) {
		TreeNode result;
		TreeNode treeNode = new TreeNode(next);
		if (currentNode == null) {
			result = treeNode;
		}
		else if (next > currentNode.val) {
			treeNode.left = currentNode;
			result = treeNode;
		}
		else {
			currentNode.right = constructMaximumBinaryTree(currentNode.right, next);
			result = currentNode;
		}
		return result;
	}


	public static void main(String[] args) {
		int[] nums = {3, 2, 1, 6, 0, 5};
		Solution654 solution654 = new Solution654();
		solution654.constructMaximumBinaryTree(nums).printWS();
	}
}