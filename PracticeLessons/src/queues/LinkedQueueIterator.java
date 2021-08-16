
package queues;

import LinkedList.Node;
import java.util.Iterator;

public class LinkedQueueIterator<T> implements Iterator<T>{
    public Node<T> current;

    public LinkedQueueIterator(Node<T> first) {
        current = first;
    }
    
    @Override
    public boolean hasNext() {
        String print = (current == null ? "null" : current.element.toString());
        System.out.println("hasNext() is called. current = " + print);
        return current != null;
    }

    @Override
    public T next() {
        String print = (current == null ? "null" : current.element.toString());
        System.out.println("next() is called. current = " + print);
        T e = current.element;
        current = current.next;
        return e;
    }
    
}
