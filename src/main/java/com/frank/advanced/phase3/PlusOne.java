package com.frank.advanced.phase3;

/**
 *
 * 考的是进位
 *
 * @author cy
 * @version PlusOne.java, v 0.1 2021年09月29日 4:43 下午 cy Exp $
 */
public class PlusOne {

    /**
     * @param digits: a number represented as an array of digits
     * @return: the result
     */
    public static int[] plusOne(int[] digits) {
        // write your code here
        int j = 0;
        for(int i=0; i<digits.length; i++) {
            int f = 1;
            for(int x=digits.length-1; x>i; x--) {
                f *= 10;
            }
            j += digits[i]*f;
        }
        j = j+1;
        String jStr = String.valueOf(j);
        System.out.println("长度"+jStr.length());
        int[] result = new int[jStr.length()];
        char[] ch = jStr.toCharArray();
        for (int i = 0; i <= ch.length - 1; i++){
            result[i] = ch[i]-'0';
        }
        return result;
    }

    public static void main(String[] args) {
        int[] digits = {9,8,7,6,5,4,3,2,1,0};
        System.out.println(plusOne(digits));
    }
}
