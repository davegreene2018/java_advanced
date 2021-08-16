
package ca2.basis;

public interface Stack<T> {
    /**
     * This method adds an element to the top of the stack
     * @param element 
     */
    public void push(T element);
    
    /**
     * This method removes the element at the top of the stack
     * @return element removed 
     */
    public T pop();
    
}
