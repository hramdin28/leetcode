package com.example.leetcode.leets.arrayshashing;

import java.util.HashSet;

public class LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {
        var set = new HashSet<Integer>(nums.length);
        var longest = 0;

        for (int num : nums) {
            set.add(num);
        }

        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int length = 1;

                while (set.contains(num + length)) {
                    length++;
                }

                longest = Math.max(longest, length);
            }
            if (longest > nums.length / 2) {
                break;
            }
        }

        return longest;
    }
}
