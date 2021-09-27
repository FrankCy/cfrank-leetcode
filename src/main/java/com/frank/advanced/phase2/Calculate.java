package com.frank.advanced.phase2;

/**
 *
 *
 * @author cy
 * @version Calculate.java, v 0.1 2021年09月27日 4:30 下午 cy Exp $
 */
public class Calculate {

    /**
     * @param a: An integer
     * @param operator: A character, +, -, *, /.
     * @param b: An integer
     * @return: The result
     */
    public int calculate(int a, char operator, int b) {
        // write your code here
        if (operator == '+') {
            return a + b;
        }
        if (operator == '-') {
            return a - b;
        }
        if (operator == '*') {
            return a * b;
        }
        if (operator == '/') {
            if(b==0) {
                return 0;
            }
            return a / b;
        }
        return 0;
    }

}
