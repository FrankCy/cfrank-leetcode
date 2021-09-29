package com.frank.advanced.phase3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 *
 *
 *
 * @author cy
 * @version FizzBuzz.java, v 0.1 2021年09月29日 3:12 下午 cy Exp $
 */
public class FizzBuzz {
    /**
     * @param n: An integer
     * @return: A list of strings.
     */
    public List<String> fizzBuzz(int n) {
        // write your code here
        List<String> list = new ArrayList();

        for(int i=1; i<=n; i++) {
            if(i%3 == 0 && i%5 ==0) {
                list.add("fizz buzz");
            } else
            if(i%3 == 0) {
                list.add("fizz");
            } else
            if(i%5 == 0) {
                list.add("buzz");
            } else {
                list.add(String.valueOf(i));
            }
        }

        return list;
    }
}
