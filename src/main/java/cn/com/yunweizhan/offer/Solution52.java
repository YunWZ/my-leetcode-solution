package cn.com.yunweizhan.offer;

import cn.com.yunweizhan.common.entity.ListNode;

public class Solution52 {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		ListNode curA = headA, curB = headB;
		while (curA != curB) {
			curA = curA != null ? curA.next : headB;
			curB = curB != null ? curB.next : headA;
		}

		return curA;
	}
}
