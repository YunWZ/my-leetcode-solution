package cn.com.yunweizhan.offer;

import cn.com.yunweizhan.common.entity.ListNode;

public class Solution06 {
/*	public int[] reversePrint(ListNode head) {
		if (head == null)
			return new int[0];

		int size = 1;
		ListNode newHead = head, temp;
		head = head.next;
		while (head != null) {
			temp = head;
			head = head.next;

			temp.next = newHead;
			newHead = temp;
			size++;
		}

		int[] res = new int[size];
		for (int i = 0; i < size; i++) {
			res[i] = newHead.val;
			newHead = newHead.next;
		}

		return res;
	}*/

	public int[] reversePrint(ListNode head) {
		if (head == null)
			return new int[0];

		int size = 1;
		ListNode newHead = head, temp;
		head = head.next;
		while (head != null) {
			temp = head;
			head = head.next;

			temp.next = newHead;
			newHead = temp;
			size++;
		}

		int[] res = new int[size];
		for (int i = 0; i < size; i++) {
			res[i] = newHead.val;
			newHead = newHead.next;
		}

		return res;
	}
	public static void main(String[] args) {
		Solution06 solution06 = new Solution06();
		int[] head = {1, 3, 2};
		ListNode builder = ListNode.builder(head);
		int[] res = solution06.reversePrint(builder);
		System.out.println(res.toString());
	}
}
