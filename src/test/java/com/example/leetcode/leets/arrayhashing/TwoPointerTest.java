package com.example.leetcode.leets.arrayhashing;

import com.example.leetcode.leets.twopointer.ValidPalindrome;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TwoPointerTest {

    private final ValidPalindrome validPalindrome = new ValidPalindrome();

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
        Assertions.assertFalse(result3);
    }
}
