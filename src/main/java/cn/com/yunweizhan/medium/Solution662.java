package cn.com.yunweizhan.medium;

import java.util.HashMap;
import java.util.Map;

import cn.com.yunweizhan.common.entity.TreeNode;

/**
 * 二叉树最大宽度
 * <p>
 * 给你一棵二叉树的根节点 root ，返回树的 最大宽度 。
 * <p>
 * 树的 最大宽度 是所有层中最大的 宽度 。
 * <p>
 * 每一层的 宽度 被定义为该层最左和最右的非空节点（即，两个端点）之间的长度。将这个二叉树视作与满二叉树结构相同，两端点间会出现一些延伸到这一层的 null 节点，这些 null 节点也计入长度。
 * <p>
 * 题目数据保证答案将会在  32 位 带符号整数范围内。
 * <p>
 * 输入：root = [1,3,2,5,3,null,9]
 * 输出：4
 * 解释：最大宽度出现在树的第 3 层，宽度为 4 (5,3,null,9) 。
 *
 * @author Weizhan▪Yun
 * @date 2022/8/27 14:24
 */
public class Solution662 {
	//depth:leftNode
	private Map<Integer, Integer> map;
	private int ans;

	public int widthOfBinaryTree(TreeNode root) {
		ans = 0;
		map = new HashMap<>();
		dfs(root, 1, 0);

		return ans;
	}

	private void dfs(TreeNode root, int nodeNumber, int depth) {
		if (root == null) {
			return;
		}

		//input left node
		if (!map.containsKey(depth)) {
			map.put(depth, nodeNumber);
		}

		Integer integer = map.get(depth);
		ans = Math.max(ans, nodeNumber - integer + 1);

		dfs(root.left, nodeNumber << 1, depth + 1);
		dfs(root.right, (nodeNumber << 1) + 1, depth + 1);
	}
}
