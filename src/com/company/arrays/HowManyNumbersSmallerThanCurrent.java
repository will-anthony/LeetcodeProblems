package com.company.arrays;

public class HowManyNumbersSmallerThanCurrent {

//    Runtime: 12 ms, faster than 47.58%
//    Memory Usage: 39.1 MB, less than 72.61%
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] results = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            int count = 0;
            for(int j = 0; j < nums.length; j++) {
                if(nums[i] > nums[j]) {
                    count++;
                }
            }
            results[i] = count;
        }
        return results;
    }
}
