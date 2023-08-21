package com.example.leetcode.leets.twopointer;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TwoPointerTest {

    private final ValidPalindrome validPalindrome = new ValidPalindrome();
    private final TwoSumArraySorted twoSumArraySorted = new TwoSumArraySorted();
    private final ThreeSum threeSum = new ThreeSum();


    @Test
    void test_product_except_self() {
        var input1 = "A man, a plan, a canal: Panama";
        var result1 = validPalindrome.isPalindrome(input1);
        Assertions.assertTrue(result1);

        var input2 = "race a car";
        var result2 = validPalindrome.isPalindrome(input2);
        Assertions.assertFalse(result2);

        var input3 = " ";
        var result3 = validPalindrome.isPalindrome(input3);
        Assertions.assertTrue(result3);

        var input4 = "a.";
        var result4 = validPalindrome.isPalindrome(input4);
        Assertions.assertTrue(result4);
    }

    @Test
    void test_product_except_self_simple_method() {
        var input1 = "A man, a plan, a canal: Panama";
        var result1 = validPalindrome.isPalindromeSimple(input1);
        Assertions.assertTrue(result1);

        var input2 = "race a car";
        var result2 = validPalindrome.isPalindromeSimple(input2);
        Assertions.assertFalse(result2);

        var input3 = " ";
        var result3 = validPalindrome.isPalindromeSimple(input3);
        Assertions.assertTrue(result3);

        var input4 = "a.";
        var result4 = validPalindrome.isPalindromeSimple(input4);
        Assertions.assertTrue(result4);
    }

    @Test
    void test_twoSumArraySorted_one_indexed() {
        int[] input1 = {5, 25, 75};
        var target1 = 100;
        int[] expected1 = {2, 3};
        var result1 = twoSumArraySorted.twoSum(input1, target1);
        Assertions.assertArrayEquals(expected1, result1);

        int[] input2 = {2, 3, 4};
        var target2 = 6;
        int[] expected2 = {1, 3};
        var result2 = twoSumArraySorted.twoSum(input2, target2);
        Assertions.assertArrayEquals(expected2, result2);

        int[] input3 = {-1, 0};
        var target3 = -1;
        int[] expected3 = {1, 2};
        var result3 = twoSumArraySorted.twoSum(input3, target3);
        Assertions.assertArrayEquals(expected3, result3);
    }

    @Test
    void test_threeSum_zero_result() {
        int[] input1 = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> expected1 = List.of(
              List.of(-1, -1, 2),
              List.of(-1, 0, 1)
        );
        var result1 = threeSum.threeSum(input1);
        Assertions.assertEquals(expected1, result1);
    }
}
