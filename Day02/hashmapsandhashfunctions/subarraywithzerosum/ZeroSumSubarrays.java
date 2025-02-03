package Day02.hashmapsandhashfunctions.subarraywithzerosum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ZeroSumSubarrays {
    public static List<List<Integer>> findSubarraysWithZeroSum(int[] arr) {
        HashMap<Integer, List<Integer>> sumMap = new HashMap<>();
        List<List<Integer>> result = new ArrayList<>();
        int cumulativeSum = 0;

        // Initialize the map with the cumulative sum of 0 at index -1
        sumMap.put(0, new ArrayList<>());
        sumMap.get(0).add(-1); // This helps to handle the case where a subarray starts from index 0

        for (int i = 0; i < arr.length; i++) {
            cumulativeSum += arr[i];

            // If the cumulative sum has been seen before, we found a zero-sum subarray
            if (sumMap.containsKey(cumulativeSum)) {
                List<Integer> indices = sumMap.get(cumulativeSum);
                for (int index : indices) {
                    // Create the subarray from index + 1 to i
                    List<Integer> subarray = new ArrayList<>();
                    for (int j = index + 1; j <= i; j++) {
                        subarray.add(arr[j]);
                    }
                    result.add(subarray);
                }
            }

            // Add the current index to the list of indices for this cumulative sum
            sumMap.putIfAbsent(cumulativeSum, new ArrayList<>());
            sumMap.get(cumulativeSum).add(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, -3, 3, 1, -1, 2, -2};
        List<List<Integer>> zeroSumSubarrays = findSubarraysWithZeroSum(arr);

        // Print the result
        for (List<Integer> subarray : zeroSumSubarrays) {
            System.out.println(subarray);
        }
    }
}