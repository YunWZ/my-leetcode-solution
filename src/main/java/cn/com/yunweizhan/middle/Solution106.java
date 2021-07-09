package cn.com.yunweizhan.middle;

import cn.com.yunweizhan.common.entity.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * 根据一棵树的中序遍历与后序遍历构造二叉树。
 * <p>
 * 注意:
 * 你可以假设树中没有重复的元素。
 * <p>
 * 例如：
 * 中序遍历 inorder = [9,3,15,20,7]
 * 后序遍历 postorder = [9,15,7,20,3]
 * <p>
 * 返回
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 */
public class Solution106 {
    Map<Integer, Integer> indexMap;
    int[] inOrder;
    int[] postOrder;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int length = inorder.length;
        if (length == 0) {
            return null;
        }
        inOrder = inorder;
        postOrder = postorder;
        indexMap = new HashMap<>(length);

        for (int i = 0; i < length; i++) {
            indexMap.put(inorder[i], i);
        }

        return buildTree(0, length - 1, length - 1);
    }

    private TreeNode buildTree(int inStart, int inEnd, int postEnd) {
        if (inStart > inEnd) {
            return null;
        } else if (inStart == inEnd) {
            return new TreeNode(postOrder[postEnd]);
        }
        TreeNode root = new TreeNode(postOrder[postEnd]);
        Integer index = indexMap.get(root.val);
        int rightSize = inEnd - index;

        root.left = buildTree(inStart, index - 1, postEnd - rightSize - 1);
        root.right = buildTree(index + 1, inEnd, postEnd - 1);
        return root;
    }

    public static void main(String[] args) {
        Solution106 solution106 = new Solution106();
        int[] preorder = {9, 3, 15, 20, 7};
        int[] inorder = {9, 15, 7, 20, 3};
        TreeNode treeNode = solution106.buildTree(preorder, inorder);
        treeNode.print();
    }

}
