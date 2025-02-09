package com.runtimeanalysisandbigonotation.comparingdifferentdatastructuresforsearching;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class ComparingDifferentDataStructures {

    // Method to generate an array of random integers of specified size
    public static int[] generateArray(int size) {
        Random rand = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(size * 10);
        }
        return array;
    }

    // Method to generate a HashSet from an array of integers
    public static HashSet<Integer> generateHashSet(int[] array) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int num : array) {
            hashSet.add(num);  // Add each number from the array to the HashSet
        }
        return hashSet;
    }

    // Method to generate a TreeSet from an array of integers
    public static TreeSet<Integer> generateTreeSet(int[] array) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int num : array) {
            treeSet.add(num);  // Add each number from the array to the TreeSet
        }
        return treeSet;
    }

    // Method to search for a target in an array and return the search time in milliseconds
    public static double searchArray(int[] array, int target) {
        long start = System.nanoTime();
        for (int num : array) {
            if (num == target) break;  // Search for the target in the array
        }
        return (System.nanoTime() - start) / 1000000.0;  // Return time in milliseconds
    }

    // Method to search for a target in a HashSet and return the search time in milliseconds
    public static double searchHashSet(HashSet<Integer> hashSet, int target) {
        long start = System.nanoTime();
        hashSet.contains(target);  // Search for the target in the HashSet
        return (System.nanoTime() - start) / 1000000.0;  // Return time in milliseconds
    }

    // Method to search for a target in a TreeSet and return the search time in milliseconds
    public static double searchTreeSet(TreeSet<Integer> treeSet, int target) {
        long start = System.nanoTime();
        treeSet.contains(target);  // Search for the target in the TreeSet
        return (System.nanoTime() - start) / 1000000.0;  // Return time in milliseconds
    }
}
