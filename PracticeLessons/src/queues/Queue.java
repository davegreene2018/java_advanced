package queues;

public interface Queue<T> {
    /**
     * This method adds a new element to the back of the queue
     * @param element to be added 
     */
    public void enqueue(T element);
    
    /**
     * This method removes the element at the front of the queue
     * @return element removed 
     */
    public T dequeue();
    
    /**
     * This method return the element at the front of the queue
     * @return the element at the front 
     */
    public T peek();
    
    /**
     * This method checks whether the queue is empty 
     * @return true if the no elements are in the queue
     */
    public boolean isEmpty();
    
    /**
     * This method gives the size of the queue (i.e. number of elements in the queue)
     * @return size  
     */
    public int size();
}
