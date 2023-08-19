package com.example.leetcode.leets.arrayhashing;

import com.example.leetcode.leets.arrayshashing.EncodeDecodeStrings;
import com.example.leetcode.leets.arrayshashing.LongestConsecutiveSequence;
import com.example.leetcode.leets.arrayshashing.ProductExceptSelf;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArrayHashingTest {

    private final EncodeDecodeStrings encodeDecodeStrings = new EncodeDecodeStrings();
    private final ProductExceptSelf productExceptSelf = new ProductExceptSelf();
    private final LongestConsecutiveSequence longestConsecutiveSequence = new LongestConsecutiveSequence();

    @Test
    void test_product_except_self() {
        int[] nums = {1, 4, 2, 3};
        int[] expected = {24, 6, 12, 8};

        var result1 = productExceptSelf.productExceptSelf(nums);

        Assertions.assertTrue(Arrays.equals(expected, result1));

        var result2 = productExceptSelf.productExceptSelfDivisionMethod(nums);
        Assertions.assertTrue(Arrays.equals(expected, result2));

    }

    @Test
    void test_encode_decode_strings() {

        String[] strings = {"neet", "code", "#Good"};

        var encodeString = encodeDecodeStrings.encode(strings);

        Assertions.assertEquals("4neet4code5#Good", encodeString);

        var decodeStrings = encodeDecodeStrings.decode(encodeString, strings.length);

        Assertions.assertArrayEquals(strings, decodeStrings);
    }

    @Test
    void test_longest_Consecutive_sequence() {
        int[] nums = {100, 4, 200, 1, 3, 2};
        int expected = 4;

        var result = longestConsecutiveSequence.longestConsecutive(nums);

        Assertions.assertEquals(expected, result);
    }
}
