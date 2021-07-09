package cn.com.yunweizhan.middle;

public class Solution8 {
    public int myAtoi(String str) {
        boolean negative = false;
        if ('-' == str.charAt(0)) {
            negative = true;
            str = str.substring(1);
        } else if ('+' == str.charAt(0)) {
            str = str.substring(1);
        }
        if (str.length() == 0)
            return 0;
        int res = 0;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i)))
                break;
            int digit = str.charAt(i) - '0';
            if (res > (Integer.MAX_VALUE - digit) / 10)
                return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            res = res * 10 + digit;
        }

        return negative ? -res : res;
    }

    public boolean isNum(char c) {
        if (48 <= c && c <= 57)
            return true;
        return false;
    }

    public static void main(String[] args) {
        String i = "-91283472332";
        Solution8 solution8 = new Solution8();
        System.out.println(solution8.myAtoi(i));
    }
}
