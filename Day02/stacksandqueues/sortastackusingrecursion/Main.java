package Day02.stacksandqueues.sortastackusingrecursion;


import java.util.Stack;
//Main class
public class Main {
    //Main Method
    public static void main(String[] args) {

        //Creating Stack to store values
        Stack<Integer> stack = new Stack<>();

        //pushing values in stack
        stack.push(5);
        stack.push(8);
        stack.push(1);
        stack.push(0);

        //Creating object of SortStack class to pass stack in construtor
        SortStack sorter = new SortStack(stack);
        //Printing Original stack
        System.out.println("Original Stack:");
        sorter.displayStack(stack);

        //Creating a new Stack to store sorted stack
        Stack<Integer> sortedStack = SortStack.sortStack(stack);
        //Printing Sorted Stack
        System.out.println("Sorted Stack:");
        sorter.displayStack(sortedStack);
    }
}
