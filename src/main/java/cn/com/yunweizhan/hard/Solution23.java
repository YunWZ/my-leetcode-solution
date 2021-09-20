package cn.com.yunweizhan.hard;

import cn.com.yunweizhan.common.entity.ListNode;

import java.util.Map;
import java.util.TreeMap;

public class Solution23 {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode res = new ListNode(-1);
        if (lists == null || lists.length == 0)
            return res;

        Map<Integer, Integer> countMap = new TreeMap<>();
        int len = lists.length;
        for (int i = 0; i < len; i++) {
            int count = 0;
            while (lists[i] != null) {
                ListNode node = lists[i];
                count = countMap.getOrDefault(node.val, 0);
                countMap.put(node.val, count + 1);
                lists[i] = node.next;
            }
        }
        if (countMap.size() != 0) {
            res = new ListNode(-1);
            ListNode temp = res;
            for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
                Integer key = entry.getKey();
                for (Integer i = 0; i < entry.getValue(); i++) {
                    temp.next = new ListNode(key);
                    temp = temp.next;
                }
            }
        }
        return res.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(4, new ListNode(5)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode l3 = new ListNode(2, new ListNode(6));
        ListNode[] lists = {l1, l2, l3};
        Solution23 solution23 = new Solution23();
        System.out.println(solution23.mergeKLists(lists));
    }
}
