package com.dsapractice;

import java.util.HashMap;
import java.util.Map;

public class TwoSumLeetCode {
    static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsToMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numsToMap.containsKey(target - nums[i])) {
                return new int[]{
                        numsToMap.get(target - nums[i]), i
                };
            }
            numsToMap.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println("Sum --->" + twoSum(nums, target));

    }
}
