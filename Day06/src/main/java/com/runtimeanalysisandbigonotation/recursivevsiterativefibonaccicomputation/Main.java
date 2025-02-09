package com.runtimeanalysisandbigonotation.recursivevsiterativefibonaccicomputation;
import static com.runtimeanalysisandbigonotation.recursivevsiterativefibonaccicomputation.RecursiveVsIterativeFibonacci.*;

public class Main {
    public static void main(String[] args) {
        int[] values = {10, 30 ,50};

        for (int n : values) {
            System.out.println("Fibonacci(" + n + ") Computation:");

            //recursive time
            long startRecursive = System.nanoTime();
            long recursiveResult = recursiveFibonacci(n);
            double recursiveTime = (System.nanoTime() - startRecursive) / 1000000.0;
            System.out.printf("Recursive Result: %d | Time: %.3f ms%n", recursiveResult, recursiveTime);

            //iterative time
            long startIterative = System.nanoTime();
            long iterativeResult = iterativeFibonacci(n);
            double iterativeTime = (System.nanoTime() - startIterative) / 1000000.0;
            System.out.printf("Iterative Result: %d | Time: %.3f ms%n", iterativeResult, iterativeTime);

            System.out.println();
        }
    }
}
