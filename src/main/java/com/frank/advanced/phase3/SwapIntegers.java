package com.frank.advanced.phase3;

/**
 *
 *
 * @author cy
 * @version SwapIntegers.java, v 0.1 2021年09月29日 2:40 下午 cy Exp $
 */
public class SwapIntegers {
    /**
     * @param A: An integer array
     * @param index1: the first index
     * @param index2: the second index
     * @return: nothing
     */
    public void swapIntegers(int[] A, int index1, int index2) {
        // write your code here
        int A1 = A[index1];
        A[index1] = A[index2];
        A[index2] = A1;
    }
}
