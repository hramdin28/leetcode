package com.example.leetcode.leets.arrayhashing;

import com.example.leetcode.leets.arrayshashing.ContainsDuplicate;
import com.example.leetcode.leets.arrayshashing.EncodeDecodeStrings;
import com.example.leetcode.leets.arrayshashing.LongestConsecutiveSequence;
import com.example.leetcode.leets.arrayshashing.ProductExceptSelf;
import com.example.leetcode.leets.arrayshashing.TopKfrequentElements;
import com.example.leetcode.leets.arrayshashing.TwoSum;
import com.example.leetcode.leets.arrayshashing.ValidAnagram;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArrayHashingTest {

    private final ContainsDuplicate containsDuplicate = new ContainsDuplicate();
    private final ValidAnagram validAnagram = new ValidAnagram();
    private final TwoSum twoSum = new TwoSum();
    private final TopKfrequentElements topKfrequentElements = new TopKfrequentElements();
    private final EncodeDecodeStrings encodeDecodeStrings = new EncodeDecodeStrings();
    private final ProductExceptSelf productExceptSelf = new ProductExceptSelf();
    private final LongestConsecutiveSequence longestConsecutiveSequence = new LongestConsecutiveSequence();

    @Test
    void test_containsDuplicate() {
        int[] nums1 = {1, 2, 3, 1};
        var result1 = containsDuplicate.containsDuplicate(nums1);
        Assertions.assertTrue(result1);

        int[] nums2 = {1, 2, 3, 4};
        var result2 = containsDuplicate.containsDuplicate(nums2);
        Assertions.assertFalse(result2);

        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        var result3 = containsDuplicate.containsDuplicate(nums3);
        Assertions.assertTrue(result3);
    }

    @Test
    void test_isAnagram() {
        var s1 = "anagram";
        var t1 = "nagaram";
        Assertions.assertTrue(validAnagram.isAnagram(s1, t1));
        Assertions.assertTrue(validAnagram.isAnagramSortMethod(s1, t1));

        var s2 = "rat";
        var t2 = "car";
        Assertions.assertFalse(validAnagram.isAnagram(s2, t2));
        Assertions.assertTrue(validAnagram.isAnagramSortMethod(s1, t1));
    }

    @Test
    void test_groupeAnagram() {
        String[] strs1 = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> expected1 = List.of(
              List.of("bat"),
              List.of("nat", "tan"),
              List.of("ate", "eat", "tea")
        );
        Assertions.assertEquals(expected1.size(), validAnagram.groupAnagrams(strs1).size());
    }

    @Test
    void test_topKFrequent() {
        int[] nums1 = {1, 1, 1, 2, 2, 3};
        int k1 = 2;
        int[] expected1 = {1, 2};
        Assertions.assertArrayEquals(expected1, topKfrequentElements.topKFrequent(nums1, k1));

    }

    @Test
    void test_twoSum() {
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] expected1 = {0, 1};
        Assertions.assertArrayEquals(expected1, twoSum.twoSum(nums1, target1));

        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] expected2 = {1, 2};
        Assertions.assertArrayEquals(expected2, twoSum.twoSum(nums2, target2));

        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] expected3 = {0, 1};
        Assertions.assertArrayEquals(expected3, twoSum.twoSum(nums3, target3));
    }


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
