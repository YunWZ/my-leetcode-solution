package cn.com.yunweizhan.offer;

import cn.com.yunweizhan.common.entity.ListNode;

public class Solution24 {
	public ListNode reverseList(ListNode head) {
		if (head == null || head.next == null)
			return head;

		ListNode newHead = head, temp;
		head = head.next;
		newHead.next = null;

		while (head != null) {
			temp = head;
			head = head.next;

			temp.next = newHead;
			newHead = temp;
		}

		return newHead;
	}

	public static void main(String[] args) {
		Solution24 solution24 = new Solution24();
		int[] head = {1, 2, 3, 4, 5};
		ListNode builder = ListNode.builder(head);
		ListNode listNode = solution24.reverseList(builder);
		System.out.println(listNode.toString());
	}
}
