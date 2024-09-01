package com.ps.alpha.expensemgmt.utils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Alpha2 {
    public static void main(String[] args) {
        List<Integer> inputList = Arrays.asList(1, 8, 2123, 51, 789, 321, 614, 987, 1000, 100, 200123, 210123);

        List<Integer> result =  inputList.stream().filter(
                data -> {
                    int tmp = data;
                    int div = 10;
                    int remainder = 0;
                    while (tmp > 10){
                        remainder = tmp%div;
                        tmp = tmp/div;
                    }
                    return (remainder == 1);
                }
        ).toList();

        result.forEach(System.out::println);
    }
}
