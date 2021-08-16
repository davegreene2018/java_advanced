package queues;

import LinkedList.Node;
import java.util.Iterator;

public class LinkedQueue<T> implements Queue<T>, Iterable<T> {
   Node<T> first;
   Node<T> last;

    public LinkedQueue() {
        first = null;
        last = null;
    }
   
    @Override
    public void enqueue(T element) {
        if(isEmpty()){
            first = new Node<>(element);
            last = first;
        }
        else {
            last.next = new Node<>(element);
            last = last.next;
        }
        
    }
   

    @Override
    public T dequeue() {
        if(isEmpty())
            throw new EmptyQueueException();
        T element = first.element;
        first = first.next;
        if(isEmpty())
            last = null;
        return element;
        
      
    }

    @Override
    public T peek() {
        if(isEmpty())
            throw new EmptyQueueException();
        return first.element;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public int size() {
        int size =0;
        for(T thi : this){
            size++;
        }
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new LinkedQueueIterator<>(first);
    }
    
    public String toString(){
        String str = "";
        for (T thi : this) {
            str += thi.toString() + "\n";
        }
        return str;
    }

    

    
    
    
}
