package Day02.hashmapsandhashfunctions.pairwithgivensuminarray;

import java.util.HashSet;

public class PairWithGivenSum {
    public static boolean hasPairWithSum(int[] arr, int target) {
        HashSet<Integer> visitedNumbers = new HashSet<>();

        for (int number : arr) {
            int complement = target - number;

            // Check if the complement exists in the set
            if (visitedNumbers.contains(complement)) {
                return true; // Pair found
            }

            // Add the current number to the set
            visitedNumbers.add(number);
        }

        return false; // No pair found
    }

    public static void main(String[] args) {
        int[] arr = {10, 15, 3, 7};
        int target = 17;

        boolean result = hasPairWithSum(arr, target);
        if (result) {
            System.out.println("There exists a pair with the given sum.");
        } else {
            System.out.println("No pair exists with the given sum.");
        }
    }
}