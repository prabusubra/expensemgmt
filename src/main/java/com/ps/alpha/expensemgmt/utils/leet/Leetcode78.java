package com.ps.alpha.expensemgmt.utils.leet;

import java.util.ArrayList;
import java.util.List;

public class Leetcode78 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums, 0);
        System.out.println("Result : "+result);
    }

    private static void backtrack(List<List<Integer>> result, List<Integer> temp, int[] nums, int start) {
        result.add(new ArrayList<>(temp));
        for (int i = start; i < nums.length; i++) {

            temp.add(nums[i]);

            backtrack(result, temp, nums, i+1);

            temp.remove(temp.size()-1);
        }

    }
}