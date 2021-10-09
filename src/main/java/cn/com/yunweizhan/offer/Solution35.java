package cn.com.yunweizhan.offer;

import java.util.HashMap;
import java.util.Map;

import cn.com.yunweizhan.common.entity.Node;

public class Solution35 {
	public Node copyRandomList(Node head) {
		if (head == null)
			return null;
/*		if (head.next == null)
			return new Node(head.val);*/
		Map<Node, Node> nodeMap = new HashMap<>();
		Node cur = head;
		while (cur != null) {
			nodeMap.put(cur, new Node(cur.val));
			cur = cur.next;
		}

		nodeMap.forEach((k, v) -> {
			v.next = nodeMap.get(k.next);
			v.random = nodeMap.get(k.random);
		});

		return nodeMap.get(head);
	}

	public static void main(String[] args) {
		Node node = new Node(-1);
		node.random = node;

		Solution35 solution35 = new Solution35();
		Node res = solution35.copyRandomList(node);
		System.out.println(res);
	}
}
