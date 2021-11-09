package cn.com.yunweizhan.offer;

import cn.com.yunweizhan.common.entity.ListNode;

public class Solution25 {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode headHolder = new ListNode(0, null), currentNode = headHolder;
		while (l1 != null && l2 != null) {
			if (l1.val > l2.val) {
				currentNode.next = l2;
				l2 = l2.next;
				if (headHolder == null) headHolder = currentNode;
				currentNode = currentNode.next;
			}
			else {
				currentNode.next = l1;
				l1 = l1.next;
				if (headHolder == null) headHolder = currentNode;
				currentNode = currentNode.next;
			}
		}
		currentNode.next = l1 != null ? l1 : l2;
		return headHolder.next;
	}
}
