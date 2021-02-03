package com.company.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class FindTheDifference {
//    Runtime: 11 ms, faster than 7.87%
//    Memory Usage: 39 MB, less than 10.39%
    public char findTheDifference(String s, String t) {
        Map<Character, Integer> counter = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if(counter.containsKey(curr)) {
                int intToIncrease = counter.get(curr);
                counter.put(curr, intToIncrease + 1);
            } else {
                counter.put(curr, 1);
            }
        }
        for(int i = 0; i < t.length(); i++) {
            char curr = t.charAt(i);
            if(!counter.containsKey(curr)) {
                return curr;
            } else {
                int intToDecrease = counter.get(curr);
                counter.put(curr, intToDecrease - 1);
                if(counter.get(curr) < 0) {
                    return curr;
                }
            }
        }
        return '?';
    }
}
