package cn.com.yunweizhan.thread;

import java.util.LinkedList;

import cn.com.yunweizhan.common.entity.Node;

/**
 * @author Weizhan▪Yun
 * @date 2022/4/11 20:59
 */
public class Volatiled2 {
	private volatile int a;

	public void put() {
		a = 0;
	}

	//{1,4,2,3}
	public int lirun(int[] prices) {
		if (prices.length < 2) {
			return 0;
		}

		int nonHold = 0;
		int hold = -prices[0];
		for (int i = 1; i < prices.length; i++) {
			int temp = nonHold;
			nonHold = Math.max(hold + prices[i], nonHold);
			hold = Math.max(hold, nonHold - prices[i]);
		}

		return nonHold;
	}

	public String printTreeByBfs(Node root) {
		if (root == null) {
			return "";
		}

		LinkedList<Node> queue = new LinkedList<>();
		queue.add(root);
		boolean isFirst = true;
		StringBuilder stringBuilder = new StringBuilder();
		while (!queue.isEmpty()) {
			int size = queue.size();

			for (int i = 0; i < size; i++) {
				//print
				if (!isFirst) {
					stringBuilder.append(" ");
				}
				else {
					isFirst = false;
				}

				Node current = queue.poll();
				stringBuilder.append(current.val);

				if (current.left != null) {
					queue.add(current.left);
				}
				if (current.right != null) {
					queue.add(current.right);
				}
			}

			isFirst = true;
			stringBuilder.append("\n");
		}

		return stringBuilder.toString();
	}

}
