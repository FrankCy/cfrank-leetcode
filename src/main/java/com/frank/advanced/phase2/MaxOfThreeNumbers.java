package com.frank.advanced.phase2;

/**
 *
 * 样例  1:
 * 	输入:  num1 = 1, num2 = 9, num3 = 0
 * 	输出: 9
 *
 * 	样例解释:
 * 	返回三个数中最大的数。
 *
 * 样例 2:
 * 	输入:  num1 = 1, num2 = 2, num3 = 3
 * 	输出: 3
 *
 * 	样例解释:
 * 	返回三个中最大的数字。
 *
 * @author cy
 * @version MaxOfThreeNumbers.java, v 0.1 2021年09月27日 4:36 下午 cy Exp $
 */
public class MaxOfThreeNumbers {
    /**
     * @param num1: An integer
     * @param num2: An integer
     * @param num3: An integer
     * @return: an interger
     */
    public static int maxOfThreeNumbers(int num1, int num2, int num3) {
        // write your code here
        int[] nums = {num1, num2, num3};
        for(int i=0; i<nums.length; i++) {
            if(i+1 == nums.length) {
                continue;
            }
            if(nums[i] > nums[i+1]) {
                nums[i+1] = nums[i];
                nums[i] = nums[i+1];
            }
        }
        return nums[nums.length - 1];
    }

    public static void main(String[] args) {
        System.out.println(maxOfThreeNumbers(1,5,3));
    }

}
