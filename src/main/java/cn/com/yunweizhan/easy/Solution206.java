package cn.com.yunweizhan.easy;

import cn.com.yunweizhan.common.entity.ListNode;

/**
 * @author Weizhan▪Yun
 * @date 2022/4/7 22:47
 */
public class Solution206 {
	public ListNode reverseList(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}

		ListNode pre = null, cur = head, temp;
		while (cur != null) {
			temp = cur.next;
			cur.next = pre;
			pre = cur;
			cur = temp;
		}

		return pre;
	}
}
