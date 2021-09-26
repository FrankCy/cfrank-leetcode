package com.frank.advanced.phase1;

/**
 *
 *
 * @author cy
 * @version ReversalThreeNumber.java, v 0.1 2021年09月24日 4:47 下午 cy Exp $
 */
public class ReversalThreeNumber {

    /**
     * @param number: A 3-digit number.
     * @return: Reversed number.
     */
    public int reverseInteger(int number) {
        // write your code here
        //获得个位数
        int num1 = number % 10;
        //获得十位数
        int num2 = (number / 10) % 10;
        //获得百位数
        int num3 = ((number / 10) / 10) % 10;
        //相加
        return num3 + num2 * 10 + num1 * 100;
    }

    /*
    // 贼笨的方法
    public int reverseInteger(int number) {
        // write your code here
        String s = String.valueOf(number);
        String y = "";
        for(int i=s.length(); i>0; i--) {
            String n = s.substring(i-1, i);
            if("0".equals(n)) {
                continue;
            }
            y+=n;
        }
        return Integer.parseInt(y);
    }
    */
}
