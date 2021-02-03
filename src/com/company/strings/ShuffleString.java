package com.company.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ShuffleString {
    public String restoreString(String s, int[] indices) {

        Map<Integer, Character> pair = new HashMap<>(s.length());
        for(int i = 0; i < s.length(); i++) {
            pair.put(indices[i], s.charAt(i));
        }

        char[] tempArray = new char[s.length()];

        for(int i = 0; i < s.length(); i++) {
             tempArray[i] = pair.get(i);
        }

        String tempString = Arrays.toString(tempArray);
        return tempString;
    }
}
