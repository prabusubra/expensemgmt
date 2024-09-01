package com.ps.alpha.expensemgmt.utils;

public class Solution1 {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3,4};
        removeDupFromSortedData(arr);

        for(int temp: arr)
            System.out.println("Output : "+temp);
    }

    /**
     * Remove duplicates from sorted array
     * Leetcode-26
     * @param arr - contains input sorted elements
     */
    private static void removeDupFromSortedData(int[] arr){
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]){
                j++;
                arr[j] = arr[i];

            }
        }

    }

    /**
     * Leetcode - 53
     * @param arr - array of integer
     * @return maxSum - returns max sum
     */
    private static int maxSubArray(int[] arr){

        int maxSum = arr[0];
        int currSum = arr[0];

        for (int i = 0; i < arr.length; i++) {
            //decides whether start a new sub array or including it
            currSum = Math.max(arr[i], currSum + arr[i]);
            maxSum = Math.max(currSum, maxSum);
        }
        return maxSum;
    }

    /**
     * Leetcode - 53
     * @param arr - array of integer
     * @return maxSum - returns max sum
     */
    private static int maxSubArrayV2(int[] arr){

        int maxSum = arr[0];
        int currSum = arr[0];
        int start, end, tmpStart = 0;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < currSum + arr[i]) {
                currSum += arr[i];
            } else {
                currSum = arr[i];
                tmpStart = i;
            }

            if (currSum > maxSum){
                maxSum = currSum;
            }

        }

        return maxSum;
    }
}
