package com.runtimeanalysisandbigonotation.searchthetargetinalargedataset;
import java.util.*;

import static com.runtimeanalysisandbigonotation.searchthetargetinalargedataset.SearchTargetInLargeDataset.*;

public class Main {
    public static void main(String[] args) {
        //Creating array whose elements are the size for arrays
        int[] datasetSizes = {1000, 10000, 1000000};

        //Iterate through every data in dataSetSizes
        for (int size : datasetSizes) {
            // Generate a random dataset using the new method
            int[] data = generateRandomArray(size); 

            // Target to search
            int target = data[new Random().nextInt(size)]; // Choose a random target from the array

            // Linear Search
            long startTime = System.nanoTime();
            int linearResult = linearSearch(data, target);
            long endTime = System.nanoTime();
            long linearDuration = endTime - startTime;

            // Binary Search (requires sorted data)
            sortData(data);
            startTime = System.nanoTime();
            int binaryResult = binarySearch(data,target,0,data.length);
            endTime = System.nanoTime();
            long binaryDuration = endTime - startTime;

            // Output results
            System.out.println("Dataset Size: " + size);
            System.out.println("Linear Search Time Duration: " + linearDuration / 1_000_000.0 + " ms");
            System.out.println("Linear Search Result: " + (linearResult != -1 ? "Element Found" : "Element Not Found"));
            System.out.println("Binary Search Time Duration: " + binaryDuration / 1_000_000.0 + " ms");
            System.out.println("Binary Search Result: " + (binaryResult != -1 ? "Element Found" : "Element Not Found"));
            System.out.println();
        }
    }
}