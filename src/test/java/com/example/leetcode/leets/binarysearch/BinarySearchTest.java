package com.example.leetcode.leets.binarysearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BinarySearchTest {

    private final BinarySearch binarySearch = new BinarySearch();

    @Test
    void test_BinarySearch() {
        int[] input1 = {-1, 0, 3, 5, 9, 12};
        int expected1 = 4;
        var result1 = binarySearch.search(input1, 9);
        Assertions.assertEquals(expected1, result1);

        int[] input2 = {-1, 0, 3, 5, 9, 12};
        int expected2 = -1;
        var result2 = binarySearch.search(input2, 2);
        Assertions.assertEquals(expected2, result2);
    }

    @Test
    void test_2d_matrix() {
        int[][] input1 = new int[][]{
              {1, 3, 5, 7},
              {10, 11, 16, 20},
              {23, 30, 34, 60},
        };
        var result1 = binarySearch.searchMatrix(input1, 3);
        Assertions.assertTrue(result1);

        int[][] input2 = new int[][]{
              {1, 3, 5, 7},
              {10, 11, 16, 20},
              {23, 30, 34, 60},
        };
        var result2 = binarySearch.searchMatrix(input2, 13);
        Assertions.assertFalse(result2);
    }

    @Test
    void test_minEatingSpeed() {
        int[] piles1 = {3, 6, 7, 11};
        int h = 8;
        var result1 = binarySearch.minEatingSpeed(piles1, h);
        Assertions.assertEquals(4, result1);
    }
}
