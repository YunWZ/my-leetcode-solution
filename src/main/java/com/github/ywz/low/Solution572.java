package com.github.ywz.low;

import com.github.ywz.common.entity.TreeNode;

public class Solution572 {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null)
            return false;
        return check(s, t) || isSubtree(s.left, t) || isSubtree(s.right, t);

    }

    private boolean check(TreeNode s, TreeNode t) {
        if (s == null && t == null)
            return true;

        if (s == null || t == null)
            return false;

        if (s.val == t.val) {
            return check(s.left, t.left) && check(s.right, t.right);
        }

        return false;
    }

    public static void main(String[] args) {
        Solution572 solution572 = new Solution572();
        TreeNode s = new TreeNode(3, new TreeNode(4, new TreeNode(1), null), new TreeNode(5, new TreeNode(2), null));
        TreeNode t = new TreeNode(3, new TreeNode(1), new TreeNode(2));
//        TreeNode s = new TreeNode(1, new TreeNode(1), null);
//        TreeNode t = new TreeNode(1);
        System.out.println(solution572.isSubtree(s, t));
    }
}
