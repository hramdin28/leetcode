package com.example.leetcode.leets.arrayshashing;

import java.util.HashMap;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        var map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            var num = nums[i];
            var difference = target - num;

            if (map.containsKey(difference)) {
                return new int[]{map.get(difference), i};
            } else {
                map.put(num, i);
            }
        }

        return new int[0];
    }
}
