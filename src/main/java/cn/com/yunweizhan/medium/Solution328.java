package cn.com.yunweizhan.medium;

import cn.com.yunweizhan.common.entity.ListNode;

public class Solution328 {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode oddListHead = head;
        ListNode oddListNode = head;
        head = head.next;

        ListNode evenListHead = head;
        ListNode evenListNode = null;
        boolean isEven = true;
        while (head != null) {
            if (isEven) {
                if (evenListNode != null) {
                    evenListNode.next = head;
                    evenListNode = head;
                } else {
                    evenListNode = head;
                }
            } else {
                oddListNode.next = head;
                oddListNode = head;
            }
            isEven = !isEven;
            head = head.next;
        }
        //如果是奇数结尾
        if (isEven && evenListNode != null) {
            evenListNode.next = null;
        }
        oddListNode.next = evenListHead;
        return oddListHead;
    }

    public static void main(String[] args) {
        int[] i = {1};
        ListNode head = new ListNode(1);
        ListNode current = head;
        for (int j = 1; j < i.length; j++) {
            current.next = new ListNode(i[j]);
            current = current.next;
        }

        Solution328 solution328 = new Solution328();
        ListNode listNode = solution328.oddEvenList(head);
        System.out.println(listNode);
    }
}