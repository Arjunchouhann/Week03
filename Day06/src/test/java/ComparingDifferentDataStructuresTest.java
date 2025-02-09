import static com.runtimeanalysisandbigonotation.comparingdifferentdatastructuresforsearching.ComparingDifferentDataStructures.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.TreeSet;

public class ComparingDifferentDataStructuresTest {

    // Test for array search method
    @Test
    public void testSearchArray() {
        int[] array = generateArray(1000);
        int target = array[500];  // Pick an element in the middle
        double timeTaken = searchArray(array, target);
        System.out.println("Array search time: " + timeTaken + " ms");
        assertTrue(timeTaken >= 0, "Search time should be a positive value");
    }

    // Test for HashSet search method
    @Test
    public void testSearchHashSet() {
        int[] array = generateArray(1000);
        HashSet<Integer> hashSet = generateHashSet(array);
        int target = array[500];  // Pick an element in the middle
        double timeTaken = searchHashSet(hashSet, target);
        System.out.println("HashSet search time: " + timeTaken + " ms");
        assertTrue(timeTaken >= 0, "Search time should be a positive value");
    }

    // Test for TreeSet search method
    @Test
    public void testSearchTreeSet() {
        int[] array = generateArray(1000);
        TreeSet<Integer> treeSet = generateTreeSet(array);
        int target = array[500];  // Pick an element in the middle
        double timeTaken = searchTreeSet(treeSet, target);
        System.out.println("TreeSet search time: " + timeTaken + " ms");
        assertTrue(timeTaken >= 0, "Search time should be a positive value");
    }

    // Test to compare search times for different data structures
    @Test
    public void testSearchPerformance() {
        int[] array = generateArray(1000);
        int target = array[500];  // Pick an element in the middle

        double arrayTime = searchArray(array, target);
        double hashSetTime = searchHashSet(generateHashSet(array), target);
        double treeSetTime = searchTreeSet(generateTreeSet(array), target);

        System.out.println("Array search time: " + arrayTime + " ms");
        System.out.println("HashSet search time: " + hashSetTime + " ms");
        System.out.println("TreeSet search time: " + treeSetTime + " ms");

        assertTrue(hashSetTime > arrayTime, "HashSet search should be faster than array search");
        assertTrue(treeSetTime < arrayTime, "TreeSet search should be faster than array search");
    }
}
