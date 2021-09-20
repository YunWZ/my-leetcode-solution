package cn.com.yunweizhan.medium;

import cn.com.yunweizhan.common.entity.TreeNode;

import java.util.Stack;

public class Solution0406 {
    Stack<TreeNode> stack = new Stack<>();

    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        if (root == null || p == null) {
            return null;
        }
        if (root.val <= p.val) {
            TreeNode right = inorderSuccessor(root.right, p);
            return right;
        } else {
            TreeNode left = inorderSuccessor(root.left, p);
            return (left != null) ? left : root;
        }

    }


    public static void main(String[] args) {
        Solution0406 solution0406 = new Solution0406();
        int[] nodes = {2, 1, 3};
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);

        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.left.left.left = new TreeNode(1);
        System.out.println(solution0406.inorderSuccessor(root, new TreeNode(0)));
    }


}
