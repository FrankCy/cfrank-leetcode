package com.frank.advanced.phase1;

/**
 *
 *
 * @author cy
 * @version AbQuestion.java, v 0.1 2021年09月24日 2:40 下午 cy Exp $
 */
public class AbQuestion {
    /**
     * @param a: An integer
     * @param b: An integer
     * @return: The sum of a and b
     */
    public int aplusb(int a, int b) {
        // write your code here
        // write your code here
        if(a==0) {
            return b;
        }
        if(b==0) {
            return a;
        }
        //不进位加法
        int x1 = a^b;
        //计算进位（只有1&1才进位，并左移一位
        int x2 = (a&b)<<1;
        //重复以上过程，直到该进位的变成0，就可return出去
        return aplusb(x1,x2);
    }
}
