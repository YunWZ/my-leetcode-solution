package cn.com.yunweizhan.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Weizhan▪Yun
 * @date 2023/1/26 13:27
 */
class Solution1904Test {
    private Solution1904 instance = new Solution1904();

    @Test
    void numberOfRounds() {
        String startTime = "12:01", finishTime = "12:44";
        test(startTime, finishTime, 1);
    }

    @Test
    void test2() {
        test("20:00", "06:00", 40);
    }

    @Test
    void test3() {
        test("00:00", "23:59", 95);
    }

    private void test(String startTime, String finishTime, int expected) {
        assertEquals(expected, instance.numberOfRounds(startTime, finishTime));
    }
}