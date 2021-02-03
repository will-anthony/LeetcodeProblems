package com.company.arrays;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] T) {
        int[] daysNumber = new int[T.length];
        for(int i = 0; i < daysNumber.length - 1;i++) {
            int count = 0;
            for(int j = i+1; j < daysNumber.length; j++) {
                if (T[i] < T[j] ) {

                }
            }
        }
        return new int[]{};
    }
}
