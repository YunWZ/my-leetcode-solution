package cn.com.yunweizhan.offer;

import java.util.LinkedList;
import java.util.List;

import cn.com.yunweizhan.common.entity.TreeNode;

public class Solution34 {
	public List<List<Integer>> pathSum(TreeNode root, int target) {
		LinkedList<List<Integer>> res = new LinkedList<>();
		LinkedList<Integer> temp = new LinkedList<>();

		dfs(res, temp, root, target);

		return res;
	}

	private void dfs(List<List<Integer>> res, LinkedList<Integer> temp, TreeNode root, int target) {
		if (root == null )
			return;

		temp.add(root.val);
		if (root.left == null && root.right == null && target == root.val) {
			res.add((List<Integer>) temp.clone());
		}
		else {
			dfs(res, temp, root.left, target - root.val);
			dfs(res, temp, root.right, target - root.val);
		}

		temp.removeLast();
	}

	public static void main(String[] args) {
		test1();
	}

	private static void test1() {
		Solution34 solution34 = new Solution34();

		int target = 22;

		TreeNode node7 = new TreeNode(7,null ,null );
		TreeNode node2 = new TreeNode(2,null ,null );
		TreeNode node11 = new TreeNode(11,node7 ,node2 );

		TreeNode nodel4 = new TreeNode(4,node11 ,null );

		TreeNode node5 = new TreeNode(5,null ,null );
		TreeNode node1 = new TreeNode(1,null ,null );

		TreeNode noder4 = new TreeNode(4,node5 ,node1 );
		TreeNode node13 = new TreeNode(13,null ,null );
		TreeNode node8 = new TreeNode(8,node13 ,noder4 );

		TreeNode root = new TreeNode(5,nodel4 ,node8 );

		System.out.println(solution34.pathSum(root, target));
	}
}
