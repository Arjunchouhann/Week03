package Day02.stacksandqueues.sortastackusingrecursion;

import java.util.Stack;
//Creating SortStack to sort stack
public class SortStack {
    //Crating attribute Stack
    private Stack<Integer> stack;

    //Constructor
    public SortStack(Stack<Integer> stack) {
        this.stack = stack;
    }

    //Method to sort Stack
    public static Stack<Integer> sortStack(Stack<Integer> stack) {
        if (stack.isEmpty() || stack.size() == 1) {
            return stack;
        }
        int top = stack.pop();

        //Recursively calling until stack size becomes one
        sortStack(stack);

        //Calling method insert
        insert(top, stack);
        //return recursive step
        return stack;
    }


    //Creating a method insert to put right stack value on correct position
    private static void insert(int element, Stack<Integer> stack) {
        if (stack.isEmpty() || stack.peek() <= element) {
            stack.push(element);
        } else {
            int top = stack.pop();

            //Recursive calling insert method
            insert(element, stack);

            //changing position in stack
            stack.push(top);
        }
    }


    //Display method
    public void displayStack(Stack<Integer> stack) {
        // Use a temporary stack to display the elements without modifying the original stack
        Stack<Integer> tempStack = new Stack<>();
        while (!stack.isEmpty()) {
            int top = stack.pop();
            System.out.println(top);
            // Store the popped elements in a temporary stack
            tempStack.push(top);
        }
        // Restore the original stack
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }

    }
}
