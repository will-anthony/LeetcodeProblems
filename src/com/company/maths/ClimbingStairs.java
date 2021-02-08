package com.company.maths;

public class ClimbingStairs {

    public int climbStairs(int n) {

//        Runtime: 0 ms, faster than 100.00%
//        Memory Usage: 35.8 MB, less than 44.78%

        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 1;
        }

        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        for(int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

}
