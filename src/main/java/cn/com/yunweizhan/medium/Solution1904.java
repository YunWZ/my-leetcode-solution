package cn.com.yunweizhan.medium;


import java.util.concurrent.TimeUnit;

/**
 * @author Weizhan▪Yun
 * @date 2023/1/26 12:06
 */
public class Solution1904 {
    public int numberOfRounds(String loginTime, String logoutTime) {
        int loginHours = Integer.parseInt(loginTime.split(":")[0]);
        int loginMinutes = Integer.parseInt(loginTime.split(":")[1]);
        int logoutHours = Integer.parseInt(logoutTime.split(":")[0]);
        int logoutMinutes = Integer.parseInt(logoutTime.split(":")[1]);

        long startTime = TimeUnit.HOURS.toMinutes(loginHours) + loginMinutes;
        long endTime = TimeUnit.HOURS.toMinutes(logoutHours) + logoutMinutes;

        if (endTime < startTime) {
            endTime += TimeUnit.DAYS.toMinutes(1L);
        }

        endTime -= endTime % 15;

        return (int) ((endTime - startTime) / 15);
    }
}