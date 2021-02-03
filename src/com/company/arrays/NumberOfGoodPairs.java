package com.company.arrays;

public class NumberOfGoodPairs {
//    Runtime: 1 ms, faster than 63.32%
//    Memory Usage: 38.4 MB, less than 5.58%

//    public int numIdenticalPairs(int[] nums) {
//        int count = 0;
//        for(int i = 0; i < nums.length - 1; i++) {
//            for(int j = i + 1; j < nums.length; j++) {
//                if (nums[i] == nums[j]) {
//                    count++;
//                }
//            }
//        }
//        return count;
//    }

//    Runtime: 0 ms, faster than 100.00%
//    Memory Usage: 36.3 MB, less than 64.88%

public int numIdenticalPairs(int[] nums) {
    int count = 0;
    int[] frequency = new int[101];

    for(int i = 0; i < nums.length; i++) {
        frequency[nums[i]]++;
    }
    for(int i = 0; i < 101; i++) {
        int currFreq = frequency[i];
        count += currFreq * (currFreq - 1) / 2;
    }

    return count;
}

}
