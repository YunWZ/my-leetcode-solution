package com.github.ywz.middle;

import com.github.ywz.common.entity.ListNode;

import java.util.HashMap;
import java.util.Map;

public class Solution19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        Map<Integer, ListNode> map = new HashMap();
        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            map.put(size++, temp);
            temp = temp.next;
        }
        ListNode preNode = map.get(size - n - 1);
        ListNode afNode = map.get(size - n + 1);
        //如果为空表示删除的是头结点
        if (preNode == null) {
            return afNode;
        } else {
            preNode.next = afNode;
        }
        return head;
    }

}

