package com.company.maths;

public class WaterBottles {

//    Runtime: 0 ms, faster than 100.00%
//    Memory Usage: 37.6 MB, less than 5.18%

    private int count = 0;
    private int remainder = 0;

    public int numWaterBottles(int numBottles, int numExchange) {
        this.count = numBottles;
        exchangeBottleMaths(numBottles, numExchange);
        return count;
    }

    private void exchangeBottleMaths(int numBottles, int numExchange) {
        if(numBottles < numExchange) {
            return;
        }
        this.remainder = numBottles % numExchange;
        numBottles /= numExchange;
        count += numBottles;

        exchangeBottleMaths(numBottles + remainder, numExchange);
    }

}
