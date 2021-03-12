package com.frank.interview;

/**
 *
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 *
 * 说明：
 *
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 *
 * 示例 1:
 *
 * 输入: [2,2,1]
 * 输出: 1
 * 示例 2:
 *
 * 输入: [4,1,2,1,2]
 * 输出: 4
 *
 * 解思路：异或，任意两个相同的数异或,答案都是0
 *
 * @author cy
 * @version One.java, v 0.1 2021年03月12日 2:01 下午 cy Exp $
 */
public class One {

    public static int singleNumber(int[] nums) {
        int num=0;
        for(int i=0;i<nums.length;i++){
            // 使用异或，相同的数字异或得0，最后只剩下一个数字
            num=num^nums[i];
        }
        return num;
    }

    public static void main(String[] args) {
        int[] a = {4,1,2,1,2};
        System.out.println(singleNumber(a));
    }

}
