package com.array.TwoSum;

import java.util.Map;
import java.util.HashMap;

public class TwoSum {
    public int[] twoSums(int[] nums, int target) {
        int[] result = new int[2];
        if(nums == null || nums.length < 2) {
            return result;
        }

        Map<Integer, Integer> numIndexMap = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++) {
            if(numIndexMap.containsKey(target - nums[i])) {
                result[0] = numIndexMap.get(target - nums[i]);
                result[1] = i;
            }
            numIndexMap.put(nums[i], i);
        }

        return result;
    }

}
