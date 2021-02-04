package com.company.maths;

public class NthTribonacciNumber {

//    with memoization

//    Runtime: 0 ms, faster than 100.00%
//    Memory Usage: 35.4 MB, less than 92.47%

//    public int tribonacci(int n) {
//        if (n == 0) {
//            return 0;
//        } else if (n == 1) {
//            return 1;
//        }
//
//        int[] sequence = new int[n + 1];
//        sequence[0] = 0;
//        sequence[1] = 1;
//        sequence[2] = 1;
//
//        for (int i = 3; i <= n; i++) {
//            sequence[i] = sequence[i - 1] + sequence[i - 2] + sequence[i - 3];
//        }
//        return sequence[n];
//    }

    // works but very slow
    public int tribonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }
        return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n -2);
    }

}
