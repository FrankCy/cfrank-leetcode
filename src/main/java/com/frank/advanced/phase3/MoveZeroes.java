package com.frank.advanced.phase3;

/**
 *
 *
 * @author cy
 * @version MoveZeroes.java, v 0.1 2021年09月28日 2:31 下午 cy Exp $
 */
public class MoveZeroes {
    /**
     * @param nums: an integer array
     * @return: nothing
     */
    public static int[] moveZeroes(int[] nums) {
        // write your code here
        int index=0;
        // 先将0往前放
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0){
                nums[index]=nums[i];
                index++;
            }
        }
        // 然后在将后面的设置为0
        for (int i = index; i < nums.length; i++) {
            nums[i]=0;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1,0,3,12,0,13};
        for(int j : moveZeroes(nums)) {
            System.out.println(j);
        }
    }
}
