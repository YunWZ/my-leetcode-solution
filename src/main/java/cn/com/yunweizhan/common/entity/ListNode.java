package cn.com.yunweizhan.common.entity;

public class ListNode {
	public int val;
	public ListNode next;

	public ListNode(int x) {
		val = x;
	}

	public ListNode(int x, ListNode next) {
		val = x;
		this.next = next;
	}

	public static ListNode builder(int[] nodeVals) {
		ListNode head = new ListNode(nodeVals[0]), tail = head;
		for (int i = 1; i < nodeVals.length; i++) {
			tail.next = new ListNode(nodeVals[i]);
			tail = tail.next;
		}

		return head;
	}

	public ListNode next(ListNode next) {
		this.next = next;
		return this;
	}

	public static ListNode builder(int i, ListNode next) {
		ListNode listNode = new ListNode(i);
		listNode.next = next;
		return listNode;
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(val).append("->");

		if (next != null) {
			stringBuilder.append(next);
		}
		else {
			stringBuilder.append("null");
		}

		return stringBuilder.toString();
	}
}
