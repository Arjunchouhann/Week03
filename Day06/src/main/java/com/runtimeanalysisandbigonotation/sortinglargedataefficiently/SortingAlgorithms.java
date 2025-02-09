package com.runtimeanalysisandbigonotation.sortinglargedataefficiently;

import java.util.Arrays;
import java.util.Random;

public class SortingAlgorithms {

    // Bubble Sort method: repeatedly compares and swaps adjacent elements if they are in the wrong order
    public static void bubbleSort(int[] arr) {
        int n = arr.length; // Get the length of the array
        // Outer loop iterates through all elements of the array
        for (int i = 0; i < n - 1; i++) {
            // Inner loop compares adjacent elements and swaps them if necessary
            for (int j = 0; j < n - i - 1; j++) {
                // If the current element is greater than the next, swap them
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Merge Sort method: recursively divides the array into two halves and merges them in sorted order
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            // Find the middle point of the array to divide it into two halves
            int mid = left + (right - left) / 2;
            // Recursively sort both halves
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    // Merge method: combines two sorted subarrays into one sorted array
    public static void merge(int[] arr, int left, int mid, int right) {
        // Calculate the sizes of the two subarrays to be merged
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create temporary arrays for the left and right halves
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        // Copy the data into temporary arrays
        System.arraycopy(arr, left, leftArr, 0, n1);
        System.arraycopy(arr, mid + 1, rightArr, 0, n2);

        // Merge the two subarrays back into the original array
        int i = 0, j = 0, k = left;
        // While there are elements in both subarrays, pick the smaller element to place in the original array
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }

        // Copy any remaining elements from the left subarray (if any)
        while (i < n1) {
            arr[k++] = leftArr[i++];
        }

        // Copy any remaining elements from the right subarray (if any)
        while (j < n2) {
            arr[k++] = rightArr[j++];
        }
    }

    // Quick Sort method: a divide-and-conquer algorithm that selects a pivot and partitions the array into smaller and larger elements
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array and get the pivot index
            int pi = partition(arr, low, high);
            // Recursively apply quickSort to the left and right subarrays around the pivot
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Partition method for Quick Sort: selects a pivot and rearranges elements around it
    public static int partition(int[] arr, int low, int high) {
        // Choose the pivot (last element in the array)
        int pivot = arr[high];
        int i = (low - 1); // Index of the smaller element

        // Rearrange the array by moving elements smaller than the pivot to the left side
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++; // Increment the index of the smaller element
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap the pivot element with the element at i + 1
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        // Return the pivot index (where the array is partitioned)
        return i + 1;
    }
}
