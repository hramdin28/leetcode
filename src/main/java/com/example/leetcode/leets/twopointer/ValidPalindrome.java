package com.example.leetcode.leets.twopointer;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {

        var chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {

            while (left < right && !Character.isLetterOrDigit(chars[left])) {
                left++;
            }

            while (left < right && !Character.isLetterOrDigit(chars[right])) {
                right--;
            }

            if (Character.toLowerCase(chars[left]) != Character.toLowerCase(chars[right])) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }

    public boolean isPalindromeSimple(String s) {

        var chars = s.toCharArray();

        var builder = new StringBuilder();

        for (int i = chars.length - 1; i >= 0; i--) {
            var charDescending = chars[i];

            if (Character.isLetterOrDigit(charDescending)) {
                builder.append(Character.toLowerCase(charDescending));
            }
        }

        var charsNew = builder.toString().toCharArray();

        for (int i = 0; i < charsNew.length; i++) {
            if (charsNew[i] != charsNew[charsNew.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
