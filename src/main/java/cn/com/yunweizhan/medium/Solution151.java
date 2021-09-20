package cn.com.yunweizhan.medium;

public class Solution151 {
    public String reverseWords(String s) {
        String[] s1 = s.trim().split(" ");
        if (s1.length <= 0)
            return "";
        boolean first = true;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = s1.length - 1; i >= 0; i--) {
            if (first) {
                first = false;
            } else if (isBlank(s1[i])) {
                continue;
            }else {
                stringBuilder.append(" ");
            }
            stringBuilder.append(s1[i]);
        }

        return stringBuilder.toString();
    }

    private boolean isBlank(String s) {
        if (s.length() == 0) {
            return true;
        }
        for (char c : s.toCharArray()) {
            if (!Character.isWhitespace(c)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Solution151 solution151 = new Solution151();
        String s = "a good   example";
        System.out.println(solution151.reverseWords(s));
    }
}
