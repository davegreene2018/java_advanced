/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

public class Node<T> {
    public T element; //value contained in the node
    public Node<T> next; //reference to the next node

    public Node(T element) {
        this.element = element;
    }

    public Node(T element, Node<T> next) {
        this.element = element;
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" + "element=" + element + '}';
    }
    
    
    
    
    
}
