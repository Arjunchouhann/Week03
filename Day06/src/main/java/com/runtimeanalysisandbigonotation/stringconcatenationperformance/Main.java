package com.runtimeanalysisandbigonotation.stringconcatenationperformance;
import static com.runtimeanalysisandbigonotation.stringconcatenationperformance.StringConcatenationPerformance.*;

public class Main {
    public static void main(String[] args) {
        int[] stringCounts = {1000, 10000, 1000000};


        for (int count : stringCounts) {
            System.out.println("Concatenating " + count + " strings:");


            // Using String
            long stringTime = stringConcatenation(count);
            System.out.println("String: " + stringTime + " ms");


            // Using StringBuilder
            long stringBuilderTime = stringBuilderConcatenation(count);
            System.out.println("StringBuilder: " + stringBuilderTime + " ms");


            // Using StringBuffer
            long stringBufferTime = stringBufferConcatenation(count);
            System.out.println("StringBuffer: " + stringBufferTime + " ms");


            System.out.println();
        }
    }
}
