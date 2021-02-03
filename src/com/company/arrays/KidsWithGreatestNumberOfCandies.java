package com.company.arrays;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestNumberOfCandies {

//    Runtime: 0 ms, faster than 100.00%
//    Memory Usage: 39.2 MB, less than 33.25% 

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> highestCandies = new ArrayList<>();

        int highestCandie = 0;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > highestCandie) {
                highestCandie = candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= highestCandie) {
                highestCandies.add(true);
            } else {
                highestCandies.add(false);
            }
        }
        return highestCandies;
    }
}
