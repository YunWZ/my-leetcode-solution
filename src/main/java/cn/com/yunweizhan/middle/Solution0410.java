package cn.com.yunweizhan.middle;

import cn.com.yunweizhan.common.entity.TreeNode;

public class Solution0410 {
    public boolean checkSubTree(TreeNode t1, TreeNode t2) {
        if (t1 == t2)
            return true;
        if ((t1 == null && t2 != null) || (t1 != null && t2 == null))
            return false;
        else if (t1.val != t2.val)
            return checkSubTree(t1.left, t2) || checkSubTree(t1.right, t2);
        else {
            return checkSubTree(t1.left, t2.left) && checkSubTree(t1.right, t2.right);
        }
    }
}


