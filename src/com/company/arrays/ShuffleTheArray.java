package com.company.arrays;

public class ShuffleTheArray {

    public int[] shuffle(int[] nums, int n) {


//        Runtime: 0 ms, faster than 100.00%
//        Memory Usage: 39.6 MB, less than 15.10%

        int[] convertedArray = new int[n*2];
        int firstElement = 0;
        int secondElement = 0;

        for (int i = 0; i < n * 2; i+=2) {

            int buffer = i / 2;
            firstElement = nums[i - buffer];
            secondElement = nums[n + i - buffer];

            convertedArray[i] = firstElement;
            convertedArray[i + 1] = secondElement;
        }
        return convertedArray;
    }

}
