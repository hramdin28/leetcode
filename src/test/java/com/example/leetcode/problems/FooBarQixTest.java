package com.example.leetcode.problems;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FooBarQixTest {

    private final FooBarQix fooBarQix = new FooBarQix();

    @ParameterizedTest
    @CsvSource({
          "1,1",
          "2,2",
          "3,FooFoo",
          "4,4",
          "5,BarBar",
          "6,Foo",
          "7,QixQix",
          "8,8",
          "9,Foo",
          "10,Bar",
          "13,Foo",
          "15,FooBarBar",
          "21,FooQix",
          "33,FooFooFoo",
          "51,FooBar",
          "53,BarFoo",
    })
    void should_return_value_when_compute(String input, String expected){

        var result = fooBarQix.compute(input);

        Assertions.assertEquals(expected, result);
    }

}
