/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

import java.util.Iterator;
import stack.Node;

/**
 *
 * @author Daveg
 * @param <T>
 */
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
