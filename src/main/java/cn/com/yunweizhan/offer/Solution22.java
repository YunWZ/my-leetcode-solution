package cn.com.yunweizhan.offer;

import cn.com.yunweizhan.common.entity.ListNode;

public class Solution22 {
	public ListNode getKthFromEnd(ListNode head, int k) {
		ListNode quick = head, slow = head;
		for (int i = 0; i < k-1; i++) {
			quick = quick.next;
		}
		while (quick != null) {
			quick = quick.next;
			slow = slow.next;
		}
		return slow;
	}
}
