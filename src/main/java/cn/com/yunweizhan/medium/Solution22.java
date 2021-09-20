package cn.com.yunweizhan.medium;

import java.util.*;

public class Solution22 {
    public List<String> generateParenthesis(int n) {
        List<String> result = new LinkedList<>();
        dfs("", n, n, result);
        return result;
    }

    private void dfs(String s, int left, int right, List<String> result) {
        if (left == 0 && right == 0) {
            result.add(s);
            return;
        }
        //由于要求有效括号，即出现n个右括号时，字符串中第n个右括号的左侧的左括号数量必然大于等于n
        //若剩余的右括号数量小于left则说明不满足“有效括号”的条件
        if (right < left)
            return;

        if (left > 0)
            dfs(s + "(", left - 1, right, result);
        if (right > 0)
            dfs(s + ")", left, right - 1, result);
    }


    public static void main(String[] args) {
        int n = 3;
        Solution22 solution22 = new Solution22();
        System.out.println(solution22.generateParenthesis(3));
    }
}