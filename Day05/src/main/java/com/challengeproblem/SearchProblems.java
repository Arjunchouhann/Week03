package com.challengeproblem;

import java.util.Arrays;

public class SearchProblems {

    // Linear Search for finding the first missing positive integer
    public static int linearSearchMissingPositive(int[] arr) {
        int n = arr.length;

        //Mark each number as visited using negative marking if it is within the range 1 to n
        for (int i = 0; i < n; i++) {
            int num = Math.abs(arr[i]);
            if (num >= 1 && num <= n) {
                if (arr[num - 1] > 0) {
                    arr[num - 1] = -arr[num - 1];
                }
            }
        }

        //Traverse the array to find the first unmarked index.
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                // Return the first missing positive integer
                return i + 1;
            }
        }

        // If no missing number found, the first missing positive is n + 1
        return n + 1;
    }

    // Binary Search for finding the index of a given target
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                // Target found, return the index
                return mid;
            }
            else if (arr[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        // Target not found
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        int target = 4;

        // Finding the first missing positive integer using Linear Search
        int missingPositive = linearSearchMissingPositive(arr.clone());
        System.out.println("First missing positive integer: " + missingPositive);

        // Sorting the array before applying Binary Search
        Arrays.sort(arr);

        // Finding the index of the target using Binary Search
        int targetIndex = binarySearch(arr, target);
        System.out.println("Index of target " + target + ": " + targetIndex);
    }
}
