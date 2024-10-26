package com.ps.alpha.expensemgmt.utils.leet;

import java.util.PriorityQueue;

public class One1 {

    public String longestDiverseString(int a, int b, int c) {
        // Max-heap (priority queue) to store the characters by their counts in descending order
        PriorityQueue<int[]> pq = new PriorityQueue<>((x, y) -> y[0] - x[0]);

        // Add 'a', 'b', and 'c' with their counts if they are greater than 0
        if (a > 0) pq.offer(new int[]{a, 'a'});
        if (b > 0) pq.offer(new int[]{b, 'b'});
        if (c > 0) pq.offer(new int[]{c, 'c'});

        StringBuilder sb = new StringBuilder();
        while (pq.size() > 0) {
            int[] cur = pq.poll();
            int n = sb.length();
            if (n >= 2 && sb.codePointAt(n - 1) == cur[0] && sb.codePointAt(n - 2) == cur[0]) {
                if (pq.size() == 0) {
                    break;
                }
                int[] next = pq.poll();
                sb.append((char) next[0]);
                if (next[1] > 1) {
                    next[1]--;
                    pq.offer(next);
                }
                pq.offer(cur);
            } else {
                sb.append((char) cur[0]);
                if (cur[1] > 1) {
                    cur[1]--;
                    pq.offer(cur);
                }
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        One1 solution = new One1();
        System.out.println(solution.longestDiverseString(1, 1, 7));  // Example Output: "ccbccacc"
    }
}
