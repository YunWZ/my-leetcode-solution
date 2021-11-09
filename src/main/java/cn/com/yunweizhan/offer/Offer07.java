package cn.com.yunweizhan.offer;

import java.util.HashMap;
import java.util.Map;

import cn.com.yunweizhan.common.entity.TreeNode;

/**
 * 输入某二叉树的前序遍历和中序遍历的结果，请构建该二叉树并返回其根节点。
 *
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 */
public class Offer07 {
	Map<Integer, Integer> inorderMap;
	int[] preorder;

	public TreeNode buildTree(int[] preorder, int[] inorder) {
		if (preorder.length == 0)
			return null;

		this.preorder = preorder;
		inorderMap = new HashMap<>(inorder.length);
		for (int i = 0; i < inorder.length; i++) {
			inorderMap.put(inorder[i], i);
		}

		return buildTree(0, 0, inorder.length - 1);
	}

	private TreeNode buildTree(int rootIndex, int leftIndex, int rightIndex) {
		if (leftIndex > rightIndex)
			return null;

		TreeNode treeNode = new TreeNode(preorder[rootIndex]);
		Integer inorderIndex = inorderMap.get(treeNode.val);

		treeNode.left = buildTree(rootIndex + 1, leftIndex, inorderIndex - 1);

		//左子树中节点的数量
		int leftSubTreeNodeSize = inorderIndex - leftIndex + 1;

		//rootIndex + leftSubTreeNodeSize即为右子树的根节点在先序数组中的索引
		treeNode.right = buildTree(rootIndex + leftSubTreeNodeSize, inorderIndex + 1, rightIndex);

		return treeNode;
	}

}
