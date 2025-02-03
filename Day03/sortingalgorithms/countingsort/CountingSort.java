package Day03.sortingalgorithms.countingsort;

import java.util.Arrays;

public class CountingSort {

    public static void countingSortAges(int[] ages) {
        // Step 1: Create a count array for ages 10 to 18
        int minAge = 10;
        int maxAge = 18;
        int rangeOfAges = maxAge - minAge + 1;
        int[] count = new int[rangeOfAges];

        // Step 2: Count the occurrences of each age
        for (int age : ages) {
            count[age - minAge]++;
        }

        // Step 3: Compute cumulative frequencies
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        // Step 4: Build the output array
        int[] output = new int[ages.length];
        for (int i = ages.length - 1; i >= 0; i--) { // Traverse the input array in reverse order
            output[count[ages[i] - minAge] - 1] = ages[i];
            count[ages[i] - minAge]--;
        }

        // Step 5: Copy the output array back to the original array
        System.arraycopy(output, 0, ages, 0, ages.length);
    }

    public static void main(String[] args) {
        int[] studentAges = {15, 10, 12, 18, 17, 15, 16, 10, 11, 14};
        countingSortAges(studentAges);
        System.out.println("Sorted student ages: " + Arrays.toString(studentAges));
    }
}