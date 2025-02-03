package Day02.stacksandqueues.implementaqueueusingstacks;

import java.util.Stack;
//Creating class QueueUsingStack to create a queue using stack

public class QueueUsingStack {
    //Creating two Stacks to create queue
    public Stack<Integer> stack1 = new Stack<>();
    public Stack<Integer> stack2 = new Stack<>();

    //Creating method Enqueue to add element in queue
    public void enqueue(int element){
        stack1.push(element);
    }

    //Creating method Dequeue to remove element in queue
    public int dequeue() throws Exception {
        if(stack2.isEmpty()){
            // Transfer elements from stack1 to stack2 if stack2 is empty
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        // If stack2 is still empty, the queue is empty
        if(stack2.isEmpty()){
            throw new Exception("Dequeue can't done from empty queue");
        }
        //Pop the top element from stack2
        return stack2.pop();
    }

    //Check if the queue is empty
    public boolean isEmpty(){
        return stack1.isEmpty() && stack2.isEmpty();
    }

    //Peek the first element
    public int peek() throws Exception {
        if(stack2.isEmpty()){
            //Transfer all the elements of stack 1 to stack 2
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        if(stack2.isEmpty()){
            throw new Exception("Peek can't done from empty queue");
        }
        return stack2.peek();
    }

    //Size finding
    public int sizeOfQueue(){
        return stack2.size()+stack1.size();
    }
}
