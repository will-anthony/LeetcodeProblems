package com.company.arrays;

public class FindLuckyIntegerInArray {

//    Runtime: 1 ms, faster than 99.65%
//    Memory Usage: 38.6 MB, less than 57.55%

    public int findLucky(int[] arr) {
        int[] frequency = new int[501];
        for (int i = 0; i < arr.length; i++) {
            frequency[arr[i]]++;
        }
        int highestLucky = -1;
        for (int i = 1; i < frequency.length; i++) {
            if (frequency[i] == i) {
                highestLucky = i;
            }
        }
        return highestLucky;
    }
}
