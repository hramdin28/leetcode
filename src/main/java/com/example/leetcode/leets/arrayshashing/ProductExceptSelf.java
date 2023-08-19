package com.example.leetcode.leets.arrayshashing;

public class ProductExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        var right = 1;
        var left = 1;
        for (int i = 0; i < nums.length; i++) {
            arr[i] = left;
            left *= nums[i];
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            arr[i] *= right;
            right *= nums[i];
        }
        return arr;
    }

    public int[] productExceptSelfDivisionMethod(int[] nums) {
        var totalProductNoZero = 1;
        var countZeros = 0;
        var zeroIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            var num = nums[i];
            if (num != 0) {
                totalProductNoZero *= num;
            } else {
                zeroIndex = i;
                countZeros++;
            }
        }

        var result = new int[nums.length];

        if (countZeros > 1) {
            return result;
        }

        if (countZeros == 1) {
            result[zeroIndex] = totalProductNoZero;
            return result;
        }

        for (int i = 0; i < nums.length; i++) {
            result[i] = totalProductNoZero / nums[i];
        }
        return result;
    }
}
