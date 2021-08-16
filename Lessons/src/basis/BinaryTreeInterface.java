
package ca2.basis;

public interface BinaryTreeInterface<T> {
    
    public void insert(T element);
    
    public boolean isEmpty();
    
    public void inOrder();
    
    public void preOrder();
    
    public void postOrder();
    
    public void printLessThan(T elem);
    
    public int CountEqualTo(T elem);
    
    public int size();
    
    public T findMin();
    
    public T findMax();
    
    public TNode<T> findNode(T elem);
    
    public TNode<T> findParent(T elem);
    
    /**
     * This method removes an element from the tree. It assumes that no duplicates 
     * exist in the tree. 
     * @param elem, the element to be removed from the tree 
     */
    public void remove(T elem);
}
 