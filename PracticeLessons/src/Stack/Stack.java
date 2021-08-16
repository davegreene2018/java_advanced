/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

import java.util.Arrays;

/**
 *
 * @author Daveg
 * @param <T>
 */
public class Stack<T> implements StackInterface<T> {
    
    private int maxsize;
    private int top;
    private T[] items;

    public Stack(int size) {
        this.maxsize = size;
        this.top = -1;
        this.items = (T[]) new Object [maxsize];
    }

    @Override
    public void push(T element) {
      if(top == maxsize-1){
          reallocate();
      }
      items[++top] = element;
    }

    @Override
    public T pop() {
        if(top == -1){
            throw new IndexOutOfBoundsException();
        }
        else {
        T elem = items[top--];
        return elem;
        }
       
    }
    
    public void reallocate (){
        items = Arrays.copyOf(items, maxsize * 2);
        
    }

    @Override
    public String toString() {
      String str = "";
      int i = top;
      while(i>=0){
          str += "element is: " + items[i] + "\n";
          i--;
      }
      return str;
    }
    
    
    
    
    
}
