/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedStack;

/**
 *
 * @author Daveg
 * @param <T>
 */
public class LinkedStack<T> implements Stack<T> {
    
  private Node<T> first;

    public LinkedStack(Node<T> first) {
        this.first = first;
    }

    @Override
    public void push(T elem) {
        if(isEmpty()){
            first = new Node(elem);
        }
        else{
            Node<T> newNode = new Node(elem, first);
            first = newNode;
        }
    }

    @Override
    public T pop() {
       if(isEmpty()){
           throw new IndexOutOfBoundsException();
       }
       else{
           T elem = first.element;
           first = first.next;
           return elem;
       }

    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public int size() {
     Node<T> current = first;
     int size = 0;
     while(current!= null){
         size++;
         current = current.next;
     }
     return size;
              
    }
    

    @Override
    public T peek() {
       return first.element;
    }
  
    
    
}
