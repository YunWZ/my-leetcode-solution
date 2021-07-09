package cn.com.yunweizhan.middle;

import java.util.HashMap;
import java.util.Map;

public class Solution146 {
    static class LRUCache {
        int capacity;
        int size;
        Node head;
        Node tail;
        Map<Integer, Node> map;

        public LRUCache(int capacity) {
            size = 0;
            this.capacity = capacity;
            map = new HashMap<>(capacity);
            head = new Node(null, -1, null, null);
            tail = new Node(null, -1, head, null);
            head.next = tail;
        }

        public int get(int key) {
            Node ans = map.get(key);
            if (ans != null) {
                deleteNode(ans);
                addNode(ans);
            } else ans = head;
            System.out.printf("key: %d, value: %d\n", key, ans.value);
            return ans.value;
        }


        private void deleteNode(Node value) {
            Node pre = value.pre;
            Node next = value.next;
            pre.next = next;
            next.pre = pre;

            value.pre = null;
            value.next = null;
        }

        public void put(int key, int value) {
            if (capacity <= 0)
                return;
            if (map.containsKey(key)) {
                Node node = map.get(key);
                node.value = value;
                deleteNode(node);
                addNode(node);
            } else {
                if (size == capacity) {
                    Node lastedNode = tail.pre;
                    map.remove(lastedNode.key);
                    deleteNode(lastedNode);
                } else {
                    size++;
                }
                addNode(key, value);
            }
        }

        private void addNode(int key, int value) {
            Node node = new Node(key, value, null, null);
            addNode(node);
        }

        private void addNode(Node node) {
            node.pre = head;
            node.next = head.next;

            head.next.pre = node;
            head.next = node;
            map.put(node.key, node);
        }

        private class Node {
            Integer key;
            Integer value;
            Node pre;
            Node next;

            public Node(Integer key, Integer value, Node pre, Node next) {
                this.key = key;
                this.value = value;
                this.pre = pre;
                this.next = next;
            }
        }
    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2 /* 缓存容量 */);
        cache.put(1, 1);
        cache.put(2, 2);
        cache.get(1);       // 返回  1
        cache.put(3, 3);    // 该操作会使得密钥 2 作废
        cache.get(2);       // 返回 -1 (未找到)
        cache.put(4, 4);    // 该操作会使得密钥 1 作废
        cache.get(1);       // 返回 -1 (未找到)
        cache.get(3);       // 返回  3
        cache.get(4);       // 返回  4
    }
}

