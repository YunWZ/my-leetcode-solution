package cn.com.yunweizhan.easy;

public class Solution504 {
    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        StringBuilder stringBuilder = new StringBuilder();
        String flag = "";
        if (num < 0) {
            flag = "-";
            num = -num;
        }
        while (num > 6) {
            stringBuilder.append(num % 7);
            num /= 7;
        }
        stringBuilder.append(num).append(flag);
        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        int num = -7;
        Solution504 solution504 = new Solution504();
        System.out.println(solution504.convertToBase7(num));
    }
}
