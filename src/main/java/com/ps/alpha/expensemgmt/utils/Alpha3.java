package com.ps.alpha.expensemgmt.utils;

import java.util.HashMap;
import java.util.Map;

public class Alpha3 {
    public static void main(String[] args) {
        System.out.println("Hello, I am in...");
       /* Given an array of integers nums and an integer target,
        return indices of the two numbers such that they add up to target.*/
       // [2,7,11,15], target = 9
        int[] arr = {3,3,1};
        int[] res = addAndTargetSumMembers(arr, 6);

        for(int temp : res){
            System.out.println(temp);
        }

    }

    private static int[] addAndTargetSumMembers(int[] arr , int target){
        int[] result = new int[2];
        Map<Integer, Integer> cache = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            // another = target - one
            int anotherNumber = target-arr[i];
            if (cache.containsKey(anotherNumber)){
                result[0] = i;
                result[1] = cache.get(anotherNumber);
                break;
            } else {
                cache.put(arr[i], i);
            }

        }

        return result;
    }
}

// 1 --> 2 --> 3

class CustomLinkedList<T> {
     class Node<T> {
            T t;
            Node next;
    }
}