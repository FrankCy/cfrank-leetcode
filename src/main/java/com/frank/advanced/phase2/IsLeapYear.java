package com.frank.advanced.phase2;

/**
 *
 * 描述
 * 判断给出的年份 n 是否为闰年. 如果 n 为闰年则返回 true
 *
 * 闰年是包含额外一天的日历年. 如果年份可以被 4 整除且不能被 100 整除 或者 可以被 400 整除, 那么这一年为闰年. --wikipedia
 *
 * @author cy
 * @version IsLeapYear.java, v 0.1 2021年09月27日 4:10 下午 cy Exp $
 */
public class IsLeapYear {
    /**
     * @param n: a number represent year
     * @return: whether year n is a leap year.
     */
    public boolean isLeapYear(int n) {
        // write your code here
        if(n == 0) {
            return false;
        }
        if( (n%4 == 0 && n%100 != 0) || n%400 ==0 ) {
            return true;
        }
        return false;
    }
}
