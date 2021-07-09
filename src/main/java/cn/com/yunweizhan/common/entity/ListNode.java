package cn.com.yunweizhan.common.entity;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public ListNode(int x, ListNode next) {
        val = x;
        this.next = next;
    }

    public ListNode next(ListNode next) {
        this.next = next;
        return this;
    }

    public static ListNode builder(int i, ListNode next) {
        ListNode listNode = new ListNode(i);
        listNode.next = next;
        return listNode;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(val);
        ListNode temp = next;
        while (temp != null) {
            stringBuilder.append("->").append(temp.val);
            temp = temp.next;
        }

        return stringBuilder.toString();
    }
}
