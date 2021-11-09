package cn.com.yunweizhan.offer;

import java.util.Stack;

/**
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。假设压入栈的所有数字均不相等。例如，序列 {1,2,3,4,5} 是某栈的压栈序列，序列 {4,5,3,2,1} 是该压栈序列对应的一个弹出序列，但 {4,3,5,1,2} 就不可能是该压栈序列的弹出序列。
 *
 * 示例 1：
 *
 * 输入：pushed = [1,2,3,4,5], popped = [4,5,3,2,1]
 * 输出：true
 */
public class Offer31 {
	public boolean validateStackSequences(int[] pushed, int[] popped) {
		int popQueueIndex = 0;
		Stack<Integer> stack = new Stack<>();
		if (pushed == null || pushed.length == 0) {
			return true;
		}
		for (int i = 0; i < pushed.length; ) {
			stack.push(pushed[i++]);

			while (!stack.isEmpty() && stack.peek() == popped[popQueueIndex]) {
				stack.pop();
				popQueueIndex++;
			}
		}

		return popQueueIndex == popped.length;
	}

	public static void main(String[] args) {
		Offer31 offer31 = new Offer31();
		System.out.println(offer31.validateStackSequences(new int[] {1, 2, 3, 4, 5}, new int[] {4, 5, 3, 2, 1}));

		System.out.println(offer31.validateStackSequences(new int[] {1, 2, 3, 4, 5}, new int[] {4, 3, 5, 1, 2}));
	}
}
