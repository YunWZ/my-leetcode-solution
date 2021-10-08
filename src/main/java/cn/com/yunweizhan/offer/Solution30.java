package cn.com.yunweizhan.offer;

import java.util.Stack;

public class Solution30 {
	class MinStack {
		Stack<Integer> originStack, minStack;

		/** initialize your data structure here. */
		public MinStack() {
			originStack = new Stack<>();
			minStack = new Stack<>();
		}

		public void push(int x) {
			originStack.push(x);
			if (minStack.empty() || x <= minStack.peek())
				minStack.push(x);
		}

		public void pop() {
			if (originStack.pop().equals(minStack.peek()))
				minStack.pop();
		}

		public int top() {
			return originStack.peek();
		}

		public int min() {
			return minStack.peek();
		}
	}
}
