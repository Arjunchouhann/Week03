package com.runtimeanalysisandbigonotation.comparingdifferentdatastructuresforsearching;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;
import static com.runtimeanalysisandbigonotation.comparingdifferentdatastructuresforsearching.ComparingDifferentDataStructures.*;

public class Main {
    //Main Method
    public static void main(String[] args) {
        int[] sizes = {1000, 100000 ,1000000};

        for (int size : sizes) {
            System.out.println("Dataset Size: " + size);

            int[] array = generateArray(size);
            HashSet<Integer> hashSet = generateHashSet(array);
            TreeSet<Integer> treeSet = generateTreeSet(array);

            int target = array[new Random().nextInt(size)];

            System.out.printf("Array Search Time: %.3f ms%n", searchArray(array, target));
            System.out.printf("HashSet Search Time: %.3f ms%n", searchHashSet(hashSet, target));
            System.out.printf("TreeSet Search Time: %.3f ms%n", searchTreeSet(treeSet, target));

            System.out.println();
        }
    }
}
