package com.github.ywz.middle;

import com.github.ywz.common.entity.ListNode;

import java.util.Stack;

public class Solution445 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = buildStack(l1);
        Stack<Integer> s2 = buildStack(l2);

        ListNode res = null;
        int c = 0;
        while (!s1.empty() || !s2.empty() || c != 0) {
            int i1 = s1.empty() ? 0 : s1.pop();
            int i2 = s2.empty() ? 0 : s2.pop();
            int cal = c + i1 + i2;
            c = cal / 10;
            ListNode temp = new ListNode(cal % 10);
            temp.next = res;
            res = temp;
        }

        return res;
    }

    private Stack<Integer> buildStack(ListNode l1) {
        Stack<Integer> res = new Stack<>();
        while (l1 != null) {
            res.push(l1.val);
            l1 = l1.next;
        }

        return res;
    }

    public static void main(String[] args) {
        ListNode l1 = ListNode.builder(5, null);//builder(7, builder(2, builder(4, builder(3, null))));
        ListNode l2 = ListNode.builder(5, null);//builder(5, builder(6, builder(4, null)));
        Solution445 solution445 = new Solution445();
        ListNode listNode = solution445.addTwoNumbers(l1, l2);
        while (listNode != null) {
            System.out.printf("%d", listNode.val);
            listNode = listNode.next;
        }
    }
}
