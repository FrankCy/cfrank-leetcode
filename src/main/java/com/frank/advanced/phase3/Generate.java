package com.frank.advanced.phase3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 *
 * @author cy
 * @version Generate.java, v 0.1 2021年09月28日 2:29 下午 cy Exp $
 */
public class Generate {
    /**
     * @param size: An integer
     * @return: An integer list
     */
    public List<Integer> generate(int size) {
        // write your code here
        List<Integer> intList = new ArrayList();
        for(int j=0; j<size; j++) {
            intList.add(j+1);
        }
        return intList;
    }
}
