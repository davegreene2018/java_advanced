/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author Daveg
 * @param <T>
 */
public interface Queue<T> {
    
    public void enqueue(T element);
    
    public T dequeue();
    
    public T peek();
    
    public int size();
    
    public boolean isEmpty();
    
}
