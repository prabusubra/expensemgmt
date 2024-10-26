package com.ps.alpha.expensemgmt.utils;

import java.util.List;

public class Alpha4 {
    public static void main(String[] args) {

        int[] res = {2,8,3,0,4,5,2,7};
        waterCapacityv1(res);

    }

    private static int waterCapacity(int[] arr){

        int n = arr.length;
        int[] leftMax = new int[n];
        leftMax[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            leftMax[i] = Math.max(leftMax[i-1], arr[i]);
        }

        int[] rightMax = new int[n];
        rightMax[n-1] = arr[n-1];

        for (int i = n-2; i >=0 ; i--) {
            rightMax[i] = Math.max(arr[i], rightMax[i+1]);
        }

        int totalWater = 0;

        for (int i = 0; i < arr.length; i++) {
            totalWater += Math.min(leftMax[i], rightMax[i]) - arr[i];
        }

        System.out.println("result : "+totalWater);
        return totalWater;
    }

    private static void waterCapacityv1(int[] arr){

        int left = 0, right = arr.length-1;
        int leftMax = 0, rightMax = 0;
        int container = 0;
        while (left < right){
            if (arr[left] < arr[right]){

                if (leftMax <= arr[left]){
                    leftMax = arr[left];
                } else {
                    container += leftMax - arr[left];
                }
                left++;

            } else {
                if (rightMax <= arr[right]){
                    rightMax = arr[right];
                } else {
                    container += rightMax - arr[right];
                }
                right--;
            }
        }

        System.out.println("Res : "+container);
    }
}

/*
interface Payments {

    public int mode(); // can be debit/credit cards/UPI/COD
    public boolean process( Payment card, int amount);

    public String status();//success, failed, pending

    public void sendNotification(List<String> listerners);

}

interface Payment {
    public boolean cardDetails(long cardNumber, int ccv);

    //Transaction

    public boolean deduct();
}



class CrediCard implements Payment {

    private long cardNumber;
    private int ccv;
    char[] otp;
    @Override
    public boolean cardDetails(long cardNumber, int ccv) {
        this.cardNumber = cardNumber;
        this.ccv = ccv;
        return deduct();
    }

    public boolean deduct(){
        return false;
    }
}*/



