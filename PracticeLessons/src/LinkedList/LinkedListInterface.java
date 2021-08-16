/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

public interface LinkedListInterface<T> {
    /**
     * This method adds an element to the linked list 
     * @param element 
     */
    public void add(T element);
    
    /**
     * This method adds an element to the list at a specific index
     * @param index
     * @param element 
     */
    public void insertAt(int index, T element); 
    
    /**
     * This method removes the first occurrence of element from the list 
     * @param element 
     */
    public void remove (T element);
    
    /**
     * This method removes the element at index 
     * @param index 
     */
    public void removeAt (int index);
    
    /**
     * This method computes the number of elements in the list
     * @return size 
     */
    public int size();
    /**
     * This method removes all the occurrences of element from the list
     * @param element to be removed
     */
    public void removeAll(T element);
    
    public boolean isEmpty(); 
    
}
