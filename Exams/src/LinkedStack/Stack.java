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
public interface Stack<T> {
    
    /**
     * 
     * @param element
     */
    public void push(T element);
    /**
     * 
     * @return 
     */
    public T pop();
    
    /**
     * 
     * @return 
     */
    public boolean isEmpty();
    
    /**
     * 
     * @return 
     */
    public int size();
    /**
     * 
     * @return 
     */
    public T peek();
    
    
}
