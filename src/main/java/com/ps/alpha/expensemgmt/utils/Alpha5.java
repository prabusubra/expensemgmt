package com.ps.alpha.expensemgmt.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Alpha5 {
    public static void main(String[] args) {
        //Ramakrishna
        //findUiqueChar("ramakrishna");
        //sortString();
        //diffWaysToCompute("2*3-4*5");

        System.out.println("Result : "+reverseWords("i.like.this.program.very.much"));

    }

    private static void findUiqueChar(String data){
        Map<Character, Long> countMap = data.chars()
                .mapToObj(character -> (char)character)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        countMap.entrySet().stream()
                .filter(d -> d.getValue() == 1)
                .map(d -> d.getKey())
                .sorted()
                .forEach(System.out::println);
    }

    private static void sortString(){
        System.out.println("Result : "+compareLocal("3", "30"));
    }

    //if negative, first argument before second argument.
    private static int compareLocal(String s1, String s2){
        return (s2 + s1).compareTo(s1 + s2);
    }

    public static List<Integer> diffWaysToCompute(String expression) {

        List<Integer> result = new ArrayList<>();
        for (int i=0; i < expression.length(); i++){
            char curr = expression.charAt(i);

            if ('+' == curr || '-' == curr || '*' == curr) {

                String leftStr = expression.substring(0, i);
                String rightStr = expression.substring(i+1);

                List<Integer> leftList = diffWaysToCompute(leftStr);
                List<Integer> rightList = diffWaysToCompute(rightStr);

                for (int left: leftList){
                    for (int right: rightList){
                        if ('+' == curr) result.add(left+right);
                        if ('-' == curr) result.add(left-right);
                        if ('*' == curr) result.add(left*right);
                    }
                }
            }
        }

        if (result.isEmpty()) result.add(Integer.parseInt(expression));

        return result;
    }

    static String  reverseWords(String str) {
        // code here
        String[] tmp = str.split("\\.");
        for (int i=0, j= tmp.length-1; i< j; i++, j--){
            String intStr = tmp[j];
            tmp[j] = tmp[i];
            tmp[i] = intStr;
        }

        return Arrays.stream(tmp).collect(Collectors.joining("."));
    }
}
