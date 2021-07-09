package cn.com.yunweizhan.low;

import java.util.HashMap;
import java.util.Stack;

public class Solution20 {
    private HashMap<Character, Character> mappings;

    public Solution20() {
        this.mappings = new HashMap<Character, Character>();
        this.mappings.put('(', ')');
        this.mappings.put('{', '}');
        this.mappings.put('[', ']');
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (mappings.containsKey(c)) {
                stack.add(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char open = stack.pop();
                if (c != mappings.get(open)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
