/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

import java.util.Arrays;

/**
 *
 * @author Daveg
 * @param <T>
 */
public class ArrayStack<T> implements Stack<T> {
    
    private int maxSize;
    private int top;
    private T[] item;
    private Node<T> first;

    public ArrayStack(int size) {
        this.maxSize = size;
        this.top =-1;
        this.item =(T[]) new Object [maxSize];
    }
    
   
    @Override
    public void push(T element) {
       if(top == maxSize -1)
           reallocate();
       else{
           item [++top] = element;
       }
    }

    @Override
    public T pop() {
        if(top == -1)
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        else {
            T elem = item[top--];
            return elem;
        }
    }

    @Override
    public int size() {
        int size =0;
        for(int i =0; i<=top; i++)
            size++;
        return size;
    }

    @Override
    public T peek() {
        if(isEmpty())
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        else
            return first.element;
    }

    @Override
    public boolean isEmpty() {
        return item == null;
    }
    
    public void reallocate(){
        item = Arrays.copyOf(item, maxSize * 2);
    }

    @Override
    public String toString() {
         String str = "";
        int i = top;
        while (i>=0){
            str += "Element is: " + item[i] + "\n";
            i--;
        }
        return str;
    }
    
    
}
