package cn.com.yunweizhan.easy;

import java.util.*;

public class Solution290 {
    public boolean wordPattern(String pattern, String str) {
        List<String> strings = Arrays.asList(str.split(" "));
        if (pattern.length() != strings.size())
            return false;
        for (int i = 0; i < strings.size(); i++) {
            if (pattern.indexOf(pattern.charAt(i)) != strings.indexOf(strings.get(i)))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String pattern = "abba", str = "dog cat cat fish";
        Solution290 solution290 = new Solution290();
        System.out.println(solution290.wordPattern(pattern, str));
    }
}
