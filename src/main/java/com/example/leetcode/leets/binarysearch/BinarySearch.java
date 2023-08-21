package com.example.leetcode.leets.binarysearch;

public class BinarySearch {

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (target > nums[mid]) {
                left = mid + 1;

            } else if (target < nums[mid]) {
                right = mid - 1;

            } else {
                return mid;
            }
        }
        return -1;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        int top = 0;
        int bottom = rows - 1;

        while (top <= bottom) {
            var mid = (top + bottom) / 2;
            if (target > matrix[mid][columns - 1]) {
                top = mid + 1;
            } else if (target < matrix[mid][0]) {
                bottom = mid - 1;
            } else {
                break;
            }
        }

        if (top > bottom) {
            return false;
        }

        int midRow = (top + bottom) / 2;

        int left = 0;
        int right = columns - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (target > matrix[midRow][mid]) {
                left = mid + 1;

            } else if (target < matrix[midRow][mid]) {
                right = mid - 1;
            } else {
                return true;
            }
        }

        return false;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 1;

        for (int pile : piles) {
            right = Math.max(right, pile);
        }

        while (left < right) {
            var k = (left + right) / 2;
            int hours = 0;
            for (int pile : piles) {
                hours += Math.ceil((double) pile / k);
            }

            if (hours > h) {
                left = k + 1;

            } else {
                right = k;
            }
        }

        return right;
    }
}
