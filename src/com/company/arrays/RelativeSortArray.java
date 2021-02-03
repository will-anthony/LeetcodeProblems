package com.company.arrays;

import java.util.*;

public class RelativeSortArray {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        Map<Integer, Integer> counter = new HashMap<>();
        List<Integer> unusedInts = new ArrayList<>();

        // keys added to counter(hash map), all values set 0
        for(int i = 0; i < arr2.length; i++) {
            counter.put(arr2[i],0);
        }

        // add values to counters and add ints to unused list
        for(int i = 0; i < arr1.length; i++) {
            if(counter.containsKey(arr1[i])) {
                counter.get(arr1[i] ++);
            } else {
                unusedInts.add(arr1[i]);
            }
        }

        return new int[]{};

    }
}
