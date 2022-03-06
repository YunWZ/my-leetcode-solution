package com.github.ywz.middle;

import com.github.ywz.common.entity.TreeNode;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.channels.FileChannel;
import java.util.*;

public class Solution199 {
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) {
            return null;
        }
        Map<Integer, Integer> view = new HashMap<>();
        Stack<TreeNode> nodeStack = new Stack<>();
        Stack<Integer> deepStack = new Stack<>();
        nodeStack.push(root);
        deepStack.push(0);
        int maxDeep = -1;

        while (!nodeStack.isEmpty()) {
            TreeNode pop = nodeStack.pop();
            int deep = deepStack.pop();
            if (pop != null) {
                maxDeep = Math.max(maxDeep, deep);
                if (!view.containsKey(deep)) {
                    view.put(deep, pop.val);
                }
                nodeStack.push(pop.left);
                deepStack.push(deep + 1);
                nodeStack.push(pop.right);
                deepStack.push(deep + 1);
            }
        }

        List<Integer> res = new LinkedList<>();
        for (int i = 0; i < maxDeep; i++) {
            res.add(view.get(i));
        }
        return res;
    }
}
