package com.frank.advanced.phase3;

/**
 *
 *
 * @author cy
 * @version MaxOfArray.java, v 0.1 2021年09月28日 2:19 下午 cy Exp $
 */
public class MaxOfArray {

    /**
     * @param A: An integer
     * @return: a float number
     */
    public float maxOfArray(float[] A) {
        // write your code here
        for(int i=0; i<A.length; i++) {
            // 越界处理
            if(A.length == i+1) {
                continue;
            }
            // 比较大小，大的顺位到下一个
            if(A[i] > A[i+1]) {
                A[i+1] = A[i];
                A[i] = A[i+1];
            }
        }
        // 获取最后一个（就是最大的）
        return A[A.length - 1];
    }

}
