/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

public class DLNode<T> {
    public T element;
    public DLNode<T> next;
    public DLNode<T> prev;

    public DLNode(T element, DLNode<T> prev, DLNode<T> next){
        this.element = element;
        this.next = next;
        this.prev = prev;
    }

    public DLNode(T element) {
        this.element = element;
        this.prev = null;
        this.next = null;
    }

    @Override
    public String toString() {
        String prevstr = (prev == null ? "null" : prev.element.toString());
        String nextstr = (next == null ? "null" : next.element.toString()); 
        return "Node: " + element + ", prev: " + prevstr + ", next: " + nextstr;
    }
    
}
