package com.ps.alpha.expensemgmt.utils;

import lombok.Getter;

public class Alpha9 {
    public static void main(String[] args) {
       /* Given an array of integers,
                delete all sub arrays that produces sum as 0
        and print the output
# input arr = 10, 7, -3, -4, 1, 6 //
# output arr = 10
        From the above input, both the below combo must be removed.
        7,-3,-4 is 0,
                -3,-4,1,6 is also 0*/

        System.out.println("Result : " + maximumSwap(2736));
    }

    private static void sumToZero(int[] arr) {

        //10, 7, -7, -10
        for (int i=0; i < arr.length; i++) {

        }

    }
    /*
    * d -> age > 50; salary >10000. department name
    * */
    // select COALELSE(d.name, ""), e.age, e.salary from employee e left join department d
    // on e.dep_id = d.id
    // groupby d.name having e.age > 50 && e.salary > 10000 ;

    public static int maximumSwap(int num) {

        char[] digits = String.valueOf(num).toCharArray();

        int n = digits.length;

        int[] lastIndex = new int[10];

        for (int i=0; i < n; i++) {
            lastIndex[digits[i] - '0'] = i; //2 - '0'
        }

        for (int i = 0; i < n; ++i) {
            for (int d = 9; d > digits[i] - '0'; --d)
                if (lastIndex[d] > i) {
                    digits[lastIndex[d]] = digits[i];
                    digits[i] = (char) ('0' + d);
                    return Integer.parseInt(new String(digits));
                }
        }
        return num;
    }
}

@Getter
final class Empl {

    private final int id;
    private final String name;

    private final Address address;

    public Empl(int id, String name, Address address){
        this.id = id;
        this.name = name;
        this.address = new Address();
    }

}
 class Address {
    public int id;
 }

