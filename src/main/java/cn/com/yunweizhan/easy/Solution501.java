package cn.com.yunweizhan.easy;

import java.util.LinkedList;
import java.util.List;

import cn.com.yunweizhan.common.entity.TreeNode;

/**
 * @author Weizhan▪Yun
 * @date 2022/3/29 20:14
 */
public class Solution501 {

	int max = 0;
	int count = 0;
	List<Integer> ans = new LinkedList<>();
	TreeNode pre = null;

	public int[] findMode(TreeNode root) {
		searchBST(root);

		int[] result = new int[ans.size()];
		for (int i = 0; i < ans.size(); i++) {
			result[i] = ans.get(i);
		}

		return result;
	}

	private void searchBST(TreeNode root) {
		if (root == null) {
			return;
		}

		searchBST(root.left);

		if (pre == null) {
			count = 1;
		}
		else if (pre.val == root.val) {
			count++;
		}
		else {
			count = 1;
		}

		if (count == max) {
			ans.add(root.val);
		}
		else if (count > max) {
			max = count;
			ans.clear();
			ans.add(root.val);
		}

		pre = root;
		searchBST(root.right);
	}
}
