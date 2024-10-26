package com.ps.alpha.expensemgmt.utils.leet;

import java.util.HashSet;
import java.util.Set;

public class leetcode1593 {

    public static void main(String[] args) {
        System.out.println("Result : "+backtracking("ababccc", 0, new HashSet<>()));
    }

    private static int backtracking(String s, int start, Set<String> seen) {

        if (start == s.length()) return 0;

        int maxCount = 0;
        //ababccc
        for (int i = start+1; i <= s.length(); i++) {
            String substr = s.substring(start, i);

            if (!seen.contains(substr)) {
                seen.add(substr);

                int count = 1 + backtracking(s, i, seen);

               // seen.remove(substr);

                maxCount = Math.max(maxCount, count);
            }
        }

        return maxCount;

    }
}
