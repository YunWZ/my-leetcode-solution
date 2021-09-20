package cn.com.yunweizhan.easy;

import cn.com.yunweizhan.common.entity.ListNode;

public class Solution21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }

    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next(new ListNode(2).next(new ListNode(4)));

        ListNode l2 = new ListNode(1);
        l2.next(new ListNode(3).next(new ListNode(4)));

        Solution21 solution21 = new Solution21();
        ListNode listNode = solution21.mergeTwoLists(l1, l2);
        System.out.println("end");
    }
}
