package com.frank.advanced.phase3;

/**
 *
 *
 * @author cy
 * @version GetAnswer.java, v 0.1 2021年09月29日 3:33 下午 cy Exp $
 */
public class GetAnswer {

    /**
     * @param num: an integer
     * @return: return an integer
     */
    public int getAnswer(int num) {
        // write your code here.
        boolean flag = true;
        int f = 0;
        while(flag) {
            if(num == 1) {
                flag = false;
                return f;
            }
            if(num % 2 == 0) {
                num = num / 2;
                f++;
            } else
            if(num % 2 == 1) {
                num = 3 * num + 1;
                f++;
            }
        }
        return num;
    }

}
