package com.company.arrays;

public class RunningSumOfOf1DArray {

    //Runtime: 0 ms, faster than 100.00%
    //Memory Usage: 39.3 MB, less than 43.00% of

    public int[] runningSum(int[] nums) {

        int count = 0;
        int[] runningSum = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            count += nums[i];
            runningSum[i] = count;
        }

        return runningSum;
    }

}
