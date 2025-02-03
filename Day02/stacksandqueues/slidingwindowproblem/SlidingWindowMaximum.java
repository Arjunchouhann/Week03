package Day02.stacksandqueues.slidingwindowproblem;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMaximum {
    public static int[] maxSlidingWindow(int[] num, int k) {
        if (num == null || num.length == 0 || k <= 0) {
            return new int[0];
        }

        int n = num.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> deque = new ArrayDeque<>(); // This will store indices of the elements

        for (int i = 0; i < n; i++) {
            // Remove indices that are out of the current window
            if (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.pollFirst();
            }

            // Remove indices from the back while the current element is greater
            while (!deque.isEmpty() && num[deque.peekLast()] <= num[i]) {
                deque.pollLast();
            }

            // Add the current index to the deque
            deque.offerLast(i);

            // If we have filled at least the first window, add the maximum to the result
            if (i >= k - 1) {
                result[i - k + 1] = num[deque.peekFirst()]; // The maximum for the current window
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] num = {1,5,3,5,6,3,2,-1,5,4,64,5};
        int k = 3;
        int[] result = maxSlidingWindow(num, k);

        // Print the result
        for (int max : result) {
            System.out.print(max + " ");
        }
    }
}
