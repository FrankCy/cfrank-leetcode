package com.frank.advanced.phase3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 *
 * @author cy
 * @version MaxNum.java, v 0.1 2021年09月28日 4:39 下午 cy Exp $
 */
public class MaxNum {
    /**
     * @param nums: the list of numbers
     * @return: return the maximum number.
     */
    public static int maxNum(List<Integer> nums) {
        // write your code here
        int j=nums.get(0);
        for(int i=0; i<nums.size(); i++){
            if(nums.get(i) > j) {
                j = nums.get(i);
            }
        }
        return j;
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(21);
        nums.add(3);
        nums.add(4);
        System.out.println(maxNum(nums));
    }

}
