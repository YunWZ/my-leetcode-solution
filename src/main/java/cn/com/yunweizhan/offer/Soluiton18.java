package cn.com.yunweizhan.offer;

import cn.com.yunweizhan.common.entity.ListNode;

public class Soluiton18 {
	public ListNode deleteNode(ListNode head, int val) {
		ListNode headHolder = new ListNode(0, head), preNode = headHolder;

		while (head != null) {
			if (head.val == val) {
				preNode.next = head.next;
				break;
			}

			preNode = head;
			head = head.next;
		}

		return headHolder.next;
	}
}
