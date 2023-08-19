package com.example.leetcode.leets.arrayshashing;

public class EncodeDecodeStrings {

    public String encode(String[] strings) {
        var builder = new StringBuilder();

        for (String str : strings) {
            builder.append(str.length())
                  .append(str);
        }
        return builder.toString();
    }

    public String[] decode(String string, int length) {
        var res = new String[length];
        var numberCharacters = Integer.parseInt(String.valueOf(string.charAt(0)));

        var wordCount = 0;
        var j = 0;

        while (j < string.length()) {
            int startIndex = j + 1;
            int endIndex = startIndex + numberCharacters;
            var word = string.substring(startIndex, endIndex);
            res[wordCount] = word;
            wordCount++;
            j += (numberCharacters + 1);
            if (j < string.length()) {
                numberCharacters = Integer.parseInt(String.valueOf(string.charAt(j)));
            }
        }
        return res;
    }
}
