package cn.com.yunweizhan.medium;

import cn.com.yunweizhan.common.entity.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * 根据一棵树的前序遍历与中序遍历构造二叉树。
 * <p>
 * 注意:
 * 你可以假设树中没有重复的元素。
 */
public class Solution105 {
    Map<Integer, Integer> indexMap;
    int[] preOrder;
    int[] inOrder;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        preOrder = preorder;
        inOrder = inorder;
        int length = preorder.length;
        if (length == 0) {
            return null;
        }
        indexMap = new HashMap<>(inorder.length);
        for (int i = 0; i < inorder.length; i++) {
            indexMap.put(inorder[i], i);
        }

        return buildTree(0, length - 1, 0, length - 1);
    }

    private TreeNode buildTree(int preStart, int preEnd, int inStart, int inEnd) {
        if (preStart > preEnd) {
            return null;
        }

        TreeNode root = new TreeNode(preOrder[preStart]);
        Integer index = indexMap.get(root.val);
        int leftSize = index - inStart;
        root.left = buildTree(preStart + 1, preStart + leftSize, inStart, index - 1);
        root.right = buildTree(preStart + leftSize + 1, preEnd, index + 1, inEnd);

        return root;
    }

    public static void main(String[] args) {
        Solution105 solution105 = new Solution105();
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};
        TreeNode treeNode = solution105.buildTree(preorder, inorder);
        treeNode.print();
    }
}
