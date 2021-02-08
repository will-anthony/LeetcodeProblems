package com.company.arrays;

import java.util.*;

public class FindAllNumbersDisappearedInAnArray {

//    Runtime: 22 ms, faster than 11.54%
//    Memory Usage: 48.2 MB, less than 52.93%

    public List<Integer> findDisappearedNumbers(int[] nums) {

        Set<Integer> missingNums = new HashSet<>();

        // populate set with all possible ints
        for(int i: nums) {
            missingNums.add(i);
        }

        for (int i = 0; i < nums.length; i++) {
            missingNums.remove(nums[i]);
        }

        return new ArrayList<>(missingNums);
    }
}
