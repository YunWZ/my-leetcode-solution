package cn.com.yunweizhan.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import cn.com.yunweizhan.common.entity.TreeNode;

/**
 * @author Weizhan▪Yun
 * @date 2022/3/24 10:45
 */
public class Solution107 {
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> ans = new LinkedList<>();
		if (root == null) {
			return ans;
		}

		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			int currentLevelSize = queue.size();
			List<Integer> list = new ArrayList<>(currentLevelSize);
			for (int i = 0; i < currentLevelSize; i++) {
				TreeNode node = queue.poll();
				list.add(node.val);

				if (node.left != null) {
					queue.add(node.left);
				}
				if (node.right != null) {
					queue.add(node.right);
				}
			}
			ans.add(0, list);
		}

		return ans;
	}
}
