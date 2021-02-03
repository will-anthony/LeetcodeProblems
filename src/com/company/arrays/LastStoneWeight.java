package com.company.arrays;

import java.util.PriorityQueue;

public class LastStoneWeight {

//    Runtime: 1 ms, faster than 89.84%
//    Memory Usage: 35.8 MB, less than 99.90%

    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
        for (int stone : stones) {
            maxHeap.add(-stone);
        }
        while (maxHeap.size() > 1) {
            int firstStone = maxHeap.poll();
            int secondStone = maxHeap.poll();

            if(firstStone - secondStone != 0) {
                maxHeap.add(firstStone - secondStone);
            }
        }
        if(maxHeap.size() == 0) {
            return 0;
        } else {
            return Math.abs(maxHeap.poll());
        }
    }
}
