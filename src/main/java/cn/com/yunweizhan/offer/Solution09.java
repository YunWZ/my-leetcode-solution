package cn.com.yunweizhan.offer;

import java.util.Stack;

public class Solution09 {

	class CQueue {
		Stack<Integer> stack1, stack2;

		public CQueue() {
			stack1 = new Stack<>();
			stack2 = new Stack<>();
		}

		public void appendTail(int value) {
			stack1.push(value);
		}

		public int deleteHead() {
			if (stack2.empty()) {
				if (stack1.empty())
					return -1;
				else {
					while (!stack1.empty()) {
						stack2.push(stack1.pop());
					}
				}
			}

			return stack2.pop();
		}
	}
}
