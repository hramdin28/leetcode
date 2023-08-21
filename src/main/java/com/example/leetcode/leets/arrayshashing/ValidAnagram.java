package com.example.leetcode.leets.arrayshashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ValidAnagram {

    /**
     * Lowercase Alphabets only
     *
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        var firstChar = 'a';

        var result = new int[26];

        for (int i = 0; i < s.length(); i++) {
            result[s.charAt(i) - firstChar]++;
            result[t.charAt(i) - firstChar]--;
        }

        for (int num : result) {
            if (num != 0) {
                return false;
            }
        }

        return true;
    }

    /**
     * Lowercase Alphabets only Sort array method
     *
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagramSortMethod(String s, String t) {
        var sChars = s.toCharArray();
        var tChars = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);

        return Arrays.equals(sChars, tChars);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        var map = new HashMap<String, List<String>>();

        for (var str : strs) {
            var chars = str.toCharArray();
            Arrays.sort(chars);
            var sortedStr = new String(chars);

            map.put(sortedStr, map.getOrDefault(sortedStr, new ArrayList<>()));

            map.get(sortedStr).add(str);
        }

        return map.values().stream().toList();
    }
}
