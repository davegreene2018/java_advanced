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
public class LinkedQueue<T> implements Queue<T>, Iterable<T> {
    
    private Node first;
    private Node last;

    public LinkedQueue() {
        first = null;
        last = null;
    }

   
    @Override
    public Iterator<T> iterator() {
        return new LinkedQueueIterator<>(first);
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
       if(isEmpty()){
           throw new EmptyQueueException();
       }
       else {
           T element = (T) first.element;
           first = first.next;
        if(isEmpty())
            last = null;
        return element;
       }
    }

    @Override
    public T peek() {
        if(isEmpty()){
            throw new EmptyQueueException();
        }
        return (T)first.element;
    }

    @Override
    public int size() {
        int size =0;
        for(int i =0; i<size; i++)
            size++;
        return size;
    }

    @Override
    public boolean isEmpty() {
       return first == null;
    }

    @Override
    public String toString() {
        String str = "";
        for(T thi : this){
            str += thi.toString()+ "\n";
        }
        return str;
    }
    
    
    
    
}
