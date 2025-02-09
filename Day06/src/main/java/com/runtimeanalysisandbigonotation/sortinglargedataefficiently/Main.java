package com.runtimeanalysisandbigonotation.sortinglargedataefficiently;

import java.util.Arrays;
import java.util.Random;

import static com.runtimeanalysisandbigonotation.sortinglargedataefficiently.SortingAlgorithms.*;

public class Main {
    public static void main(String[] args) {
        // Define different dataset sizes for testing the sorting algorithms
        int[] sizes = {1000, 10000 ,1000000};
        Random random = new Random(); // Create a random number generator

        // Loop through each dataset size
        for (int size : sizes) {
            // Create a random array of integers for the given dataset size
            int[] data = new int[size];
            for (int i = 0; i < size; i++) {
                data[i] = random.nextInt(size * 10); // Fill the array with random numbers
            }

            // Make copies of the original dataset to ensure each algorithm works on the same data
            int[] dataBubble = Arrays.copyOf(data, data.length);
            int[] dataMerge = Arrays.copyOf(data, data.length);
            int[] dataQuick = Arrays.copyOf(data, data.length);

            // Measure the time taken by Bubble Sort and time taken for sorting 1000000 data is very large so it takes so much time
            long startTime = System.nanoTime();
            bubbleSort(dataBubble); // Call bubbleSort on the copy of data
            long bubbleTime = System.nanoTime() - startTime; // Calculate the elapsed time

            // Measure the time taken by Merge Sort
            startTime = System.nanoTime();
            mergeSort(dataMerge, 0, dataMerge.length - 1); // Call mergeSort on the copy of data
            long mergeTime = System.nanoTime() - startTime; // Calculate the elapsed time

            // Measure the time taken by Quick Sort
            startTime = System.nanoTime();
            quickSort(dataQuick, 0, dataQuick.length - 1); // Call quickSort on the copy of data
            long quickTime = System.nanoTime() - startTime; // Calculate the elapsed time

            // Print the results for the current dataset size
            System.out.println("Dataset Size: " + size);
            System.out.println("Bubble Sort Time: " + bubbleTime / 1000000.0 + " ms"); // Convert to milliseconds
            System.out.println("Merge Sort Time: " + mergeTime / 1000000.0 + " ms");
            System.out.println("Quick Sort Time: " + quickTime / 1000000.0 + " ms");
            System.out.println(); // Print a blank line for better readability between dataset sizes
        }
    }
}
