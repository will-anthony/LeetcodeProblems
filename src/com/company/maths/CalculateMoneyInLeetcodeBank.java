package com.company.maths;

public class CalculateMoneyInLeetcodeBank {

    public int totalMoney(int n) {
        int total = 0;
        int weekNo = n / 7;
        total += weekNo * 28;

        if(weekNo > 0) {
            total += (weekNo) * 7;
        }

        total += initialSeven(n % 7, weekNo);

        return total;
    }

    public int initialSeven(int n, int weekNo) {
        int count = 0;
        for (int i = n; i > 0; i--) {
            count += (i + weekNo);
        }
        return count;
    }
}
