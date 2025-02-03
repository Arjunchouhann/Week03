package Day02.stacksandqueues.implementaqueueusingstacks;

public class Main {
    public static void main(String[] args) throws Exception {
        //Creating queue objects
        QueueUsingStack queue = new QueueUsingStack();

        //Enqueue elements in queue
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);

        System.out.println("Size of queue is : "+queue.sizeOfQueue());

        //checking peek operation of queue
        System.out.println("peek element : "+queue.peek());

        //checking Dequeue operation
        System.out.println("Dequeue element : "+queue.dequeue());
        System.out.println("Dequeue element : "+queue.dequeue());

        //printing all remaining values
        if(!queue.isEmpty()) {
            while (!queue.isEmpty()) {
                System.out.print(queue.dequeue() + " <- ");
            }
            System.out.print("end");
        }
        else {
            System.out.println("Queue is empty");
        }

    }
}
