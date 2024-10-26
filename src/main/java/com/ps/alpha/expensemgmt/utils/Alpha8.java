package com.ps.alpha.expensemgmt.utils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Alpha8 {
    public static void main(String[] args) {
       /* //input = [apples, bannas, oranges]
        //
        //str = apples, bannas, oranges

        //printItems(Arrays.asList("Apples", "Banana", "Oranges"));
        List<Integer> input = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        printOddSquares(input);*/

        //[1,5,10,15,20,25,36,21,4,6] method(2,8,3)
    }

    /*private static void printItems(List<String> items) {
        System.out.println(items.stream().collect(Collectors.joining(",")));
    }

    // square value of odd numbers.
    //[1,2,3,4,5,6,7]
    private static void printOddSquares(List<Integer> data){
        List<Integer> result = data.stream()
                .filter(item -> item%2 == 1)
                .map(item -> item*item)
                .collect(Collectors.toList());
    }*/

    private static void removeByIndex(List<Integer> data,  Integer ...arg){

        int count = 0;
        for (int i=0; i< arg.length;i++){
            if (arg[i] > data.size()-1) throw new IllegalArgumentException("Out of range");
            data.remove(arg[i] - count);
            count++;
        }
    }

}
