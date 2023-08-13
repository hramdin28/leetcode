package com.example.leetcode.problems;

import java.util.LinkedHashMap;
import java.util.Map;

public class FooBarQix {

    private static final String EMPTY_SPACE = "";

    private static final Map<Integer, String> DIGIT_MAP = new LinkedHashMap<>();

    static {
        DIGIT_MAP.put(3, "Foo");
        DIGIT_MAP.put(5, "Bar");
        DIGIT_MAP.put(7, "Qix");
    }

    public String compute(String numberString) {

        var result = new StringBuilder(EMPTY_SPACE);

        var number = Integer.parseInt(numberString);

        checkIsDivisible(number, result);

        checkDigits(numberString, result);

        if(!EMPTY_SPACE.contentEquals(result)){
            return result.toString();
        }

        return numberString;
    }


    private void checkIsDivisible(int number, StringBuilder buffer) {

        for (var entry : DIGIT_MAP.entrySet()) {

            if( isDivisible(number, entry.getKey())){
                buffer.append(entry.getValue());
            }
        }
    }

    private void checkDigits(String numberString, StringBuilder buffer) {
        for (var digit : numberString.split(EMPTY_SPACE)) {

            var digitInteger = DIGIT_MAP.get(Integer.valueOf(digit));

            if (digitInteger != null){
                buffer.append(digitInteger);
            }
        }
    }

    private boolean isDivisible(int number, int divisor) {
        return number % divisor == 0;
    }
}
