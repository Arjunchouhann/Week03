package Day02.stacksandqueues.stockspanproblem;

import java.util.Stack;

public class Stock {
    public static int[] calculateSpan(int[] prices) {

        // Return an empty array for null or empty input
        if (prices == null || prices.length == 0) {
            return new int[0];
        }

        int n = prices.length;
        int[] spans = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            // Pop elements from the stack while the current price is greater than or equal to
            // the price at the index stored at the top of the stack
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }

            // If the stack is empty, it means the current price is greater than all previous prices
            if (stack.isEmpty()) {
                spans[i] = i + 1; // Span is the index + 1
            }
            else {
                // Otherwise, the span is the difference between the current index and the index
                // of the last higher price
                spans[i] = i - stack.peek();
            }

            // Push the current index onto the stack
            stack.push(i);
        }

        return spans;
    }

    public static void main(String[] args) {

        //Creating price array and span
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] spans = calculateSpan(prices);

        //Printing span
        System.out.println("Spans: ");
        for (int span : spans) {
            System.out.print(span + " ");
        }
    }
}