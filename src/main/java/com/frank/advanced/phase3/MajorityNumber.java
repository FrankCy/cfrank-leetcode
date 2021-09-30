package com.frank.advanced.phase3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 *
 * @author cy
 * @version MajorityNumber.java, v 0.1 2021年09月30日 4:11 下午 cy Exp $
 */
public class MajorityNumber {

    /**
     * @param nums: a list of integers
     * @return: find a  majority number
     */
    public int majorityNumber(List<Integer> nums) {
        // write your code here
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.size(); i++) {
            //出现次数
            int x=0;
            for(int j=0; j<nums.size(); j++) {
                if(nums.get(i).equals(nums.get(j))) {
                    x++;
                }
            }
            map.put(nums.get(i), x);
        }
        int z = 0;
        int v = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > z) {
                z = entry.getValue();
                v = entry.getKey();
            }
        }
        return v;
    }
}
