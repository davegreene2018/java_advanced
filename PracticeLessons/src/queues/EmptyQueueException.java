
package queues;

class EmptyQueueException extends RuntimeException {

    public EmptyQueueException() {
        super("Tried to access an empty queue");
    }
}
