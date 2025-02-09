package com.runtimeanalysisandbigonotation.recursivevsiterativefibonaccicomputation;

public class RecursiveVsIterativeFibonacci {

    //recursive method
    public static long recursiveFibonacci(int n) {
        if (n <= 1) return n;
        return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
    }
    //iterative method
    public static long iterativeFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        long a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            long temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }
}
