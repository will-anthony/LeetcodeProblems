package com.company.matrixes;

public class RichestCustomerWealth {

//    Runtime: 1 ms, faster than 16.77%
//    Memory Usage: 40.1 MB, less than 11.98%

    public int maximumWealth(int[][] accounts) {
        int highest = 0;
        for (int i = 0; i < accounts.length; i++) {
            int potentialHighest = 0;
            for(int j = 0; j < accounts[i].length; j++) {
                potentialHighest += accounts[i][j];
            }
            if (potentialHighest > highest) {
                highest = potentialHighest;
            }
        }
        return highest;
    }

}
