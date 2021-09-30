package com.frank.advanced.phase3;

import java.util.Arrays;

/**
 *
 *
 * @author cy
 * @version SecondMax.java, v 0.1 2021年09月30日 3:36 下午 cy Exp $
 */
public class SecondMax {
    /**
     * @param nums: An integer array
     * @return: The second max number in the array.
     */
    public static int secondMax(int[] nums) {
        // write your code here
        Arrays.sort(nums);  //将数组元素从小到大排序
        return nums[nums.length - 2];
    }

    public static void main(String[] args) {
        int[] x = {1,3,2,2,99,77,1024};
        System.out.println(secondMax(x));
    }
}
