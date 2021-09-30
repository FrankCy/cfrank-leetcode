package com.frank.advanced.phase3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 *
 * @author cy
 * @version Prime.java, v 0.1 2021年09月30日 2:06 下午 cy Exp $
 */
public class Prime {

    /**
     * @param n: an integer
     * @return: return all prime numbers within n.
     */
    public List<Integer> prime(int n) {
        // write your code here
        List<Integer> list = new ArrayList<>();
        if(n>=2) {
            list.add(2);
        }
        if(n>=3) {
            list.add(3);
        }
        for(int i=5;i<=n;i++){
            int j=2;
            boolean istrue = true;
            for(;j<i/2;j++){
                if(i%j==0){
                    istrue = false;
                    break;
                }
            }
            if(istrue){
                list.add(i);
            }
        }
        return list;
    }

}
