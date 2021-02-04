package com.company.arrays;

import java.util.Arrays;

public class DefuseTheBomb {

//    Runtime: 2 ms, faster than 45.84%
//    Memory Usage: 39.1 MB, less than 51.49%

//    public int[] decrypt(int[] code, int k) {
//        if (k == 0) {
//            Arrays.fill(code, 0);
//        }
//        int[] transArray = new int[code.length];
//        if (k > 0) {
//            for (int i = 0; i < code.length; i++) {
//                int count = 0;
//                int pointer = i + 1;
//                int total = 0;
//                while (count < k) {
//                    if (pointer > code.length - 1) {
//                        pointer = 0;
//                    }
//                    total += code[pointer];
//                    count++;
//                    pointer++;
//                }
//                transArray[i] = total;
//            }
//        } else {
//            for (int i = code.length - 1; i >= 0; i--) {
//                int count = 0;
//                int pointer = i - 1;
//                int total = 0;
//                while (count < Math.abs(k)) {
//                    if (pointer < 0) {
//                        pointer = code.length - 1;
//                    }
//                    total += code[pointer];
//                    count++;
//                    pointer--;
//                }
//                transArray[i] = total;
//            }
//        }
//        return transArray;
//    }

    // keep track of total



//    0 ms, faster than 100.00%
//    Memory Usage: 39 MB, less than 65.67%
    public int[] decrypt(int[] code, int k) {
        if (k == 0) {
            Arrays.fill(code, 0);
        }
        int[] transArray = new int[code.length];
        if (k > 0) {

            // find sum of the first index
            int trackingTotal = 0;
            int count = 1;
            while (count <= k) {
                trackingTotal += code[count];
                count++;
            }
            transArray[0] = trackingTotal;

            // subtract previous element from total, add next element to total, add int to trans array
            for (int i = 1; i < code.length; i++) {
                trackingTotal -= code[i];
                if (k + i >= code.length) {
                    trackingTotal += code[((i + k) % code.length)];
                } else {
                    trackingTotal += code[i + k];
                }
                transArray[i] = trackingTotal;
            }

        } else {
            // find sum of the first index
            k = Math.abs(k);
            int trackingTotal = 0;
            int lastIndex = code.length - 2;
            int count = lastIndex;
            while (count > lastIndex - k) {
                trackingTotal += code[count];
                count--;
            }
            transArray[code.length - 1] = trackingTotal;

            // subtract previous element from total, add next element to total, add int to trans array
            for (int i = code.length - 2; i >= 0; i--) {
                trackingTotal -= code[i];
                if (i - k < 0) {
                    int diff = (i - k) + code.length;
                    trackingTotal += code[diff];
                } else {
                    trackingTotal += code[i - k];
                }
                transArray[i] = trackingTotal;
            }
        }
        return transArray;
    }
}
