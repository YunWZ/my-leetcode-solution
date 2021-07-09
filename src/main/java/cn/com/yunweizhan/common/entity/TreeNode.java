package cn.com.yunweizhan.common.entity;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }

    public TreeNode(int x, TreeNode left, TreeNode right) {
        val = x;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return Integer.toString(val);
    }

    public void print() {
        print(this, 0);
    }

    private void print(TreeNode treeNode, int deep) {
        if (treeNode == null) {
            System.out.println(" null");
            return;
        }
        for (int i = 0; i < deep; i++) {
            System.out.printf("\t");
        }
        System.out.println(treeNode);
        System.out.printf("left");
        print(treeNode.left, deep + 1);
        System.out.printf("right");
        print(treeNode.right, deep + 1);
    }

}
