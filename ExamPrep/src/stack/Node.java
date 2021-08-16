/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author Daveg
 */
public class Node<T> {
    public T element;
    public Node<T> next;

    public Node(T element) {
        this.element = element;
    }

    public Node(T element, Node<T> next) {
        this.element = element;
        this.next = next;
    }
    
    
    
}
