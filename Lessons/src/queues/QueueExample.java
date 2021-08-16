package queues;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedQueue<>();
        //queue.dequeue();
        queue.enqueue("John");
        queue.enqueue("Jack");
        queue.enqueue("Jason");
        queue.enqueue("Joan");
        System.out.println("Size of the queue is: " + queue.size());
        System.out.println(queue);
        queue.dequeue();
        System.out.println("the element at the front is: " +queue.peek());
    }
}
