package com.frank.advanced.phase2;

/**
 *
 * 解法：思维题
 * 解题思路
 * 1
 * 2
 * 闰年判断条件：(year%4==0&&year%100!=0)||year%400==0)
 * 只有2月的闰年是29天，其余都是28天，直接判断即可。
 * 复杂度分析
 * 时间复杂度：O（1）
 * 1 直接可以判断
 * 空间复杂度：O（1）
 * 1 不占用额外辅助空间
 *
 * @author cy
 * @version GetTheMonthDays.java, v 0.1 2021年09月27日 4:23 下午 cy Exp $
 */
public class GetTheMonthDays {
    /**
     * @param year: a number year
     * @param month: a number month
     * @return: Given the year and the month, return the number of days of the month.
     */
    public int getTheMonthDays(int year, int month) {
        int[] day = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2) {
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                return 29;
            }
        }
        return day[month];
    }
}
