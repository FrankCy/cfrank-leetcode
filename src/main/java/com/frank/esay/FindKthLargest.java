package com.frank.esay;

/**
 * (215.数组中第K个最大元素)
 */
public class FindKthLargest {

    /**
     * 快排实现
     * @param nums
     * @param k
     * @return
     */
    public int findKthLargest(int[] nums, int k) {
        int temp;
        int j;

        for(int i=0; i<nums.length; i++) {
            temp = nums[i];
            for(j=i-1; j>=0 && nums[j]>temp; j--) {
                nums[j+1] = nums[j];
            }
            nums[j+1] = temp;

        }
        return nums[nums.length-k];
    }

    public static void main(String[] args) {
        int[] i = {11,33,44,13,17,19,31,99,98,95};
        System.out.println(new FindKthLargest().findKthLargest(i, 2));
    }

}
