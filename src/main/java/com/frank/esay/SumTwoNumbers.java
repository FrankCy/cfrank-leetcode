package com.frank.esay;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class SumTwoNumbers {

    /**
     * 下面例子阶梯思路（解法来源于网络）
     * 合 - x = y；
     * 题目是 x+y = 合；
     * 所以使用HashMap，用 y 作为HashMap的Key，即x+y=合，将当前下标作为value.
     * 下次进入时，每个数作为key与y进行比较，如果比较成功，证明当前这个数为x，然后保留x，y的坐标返回即可
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {

        int[] indexs = new int[2];

        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++) {
            if(hash.containsKey(nums[i])) {
                indexs[0] = hash.get(nums[i]);
                indexs[1] = i;
                return indexs;
            }
            hash.put(target-nums[i], i);
        }
        return indexs;
    }

    public static void main(String[] args) {
        int[] nums = {2,1,6,9,8,4,11};
        int target = 10;

        System.out.println(Arrays.toString(new SumTwoNumbers().twoSum(nums, target)));
    }

}
