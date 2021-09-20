package cn.com.yunweizhan.medium;

import cn.com.yunweizhan.common.entity.ListNode;

public class Solution19_doublepoint {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode first = head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode second = dummy;
        for (int i = 0; i < n; i++) {
            first = first.next;
        }

        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return dummy.next;
    }
}
