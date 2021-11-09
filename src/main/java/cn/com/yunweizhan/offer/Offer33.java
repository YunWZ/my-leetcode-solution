package cn.com.yunweizhan.offer;

import java.util.Stack;

/**
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历结果。如果是则返回 true，否则返回 false。假设输入的数组的任意两个数字都互不相同。
 *
 */
public class Offer33 {
	int[] postorder;

	public boolean verifyPostorder(int[] postorder) {
		Stack<Integer> stack = new Stack<>();
		int root = Integer.MAX_VALUE;

		for (int i = postorder.length - 1; i >= 0; i--) {
			if (postorder[i] > root) return false;
			while (!stack.isEmpty() && stack.peek() > postorder[i]) {
				root = stack.pop();
			}
			stack.push(postorder[i]);
		}

		return true;
	}

	public static void main(String[] args) {
		test(new int[] {1, 6, 3, 2, 5});
	}

	private static void test(int[] ints) {
		Offer33 offer33 = new Offer33();
		System.out.println(offer33.verifyPostorder(ints));
	}
}
