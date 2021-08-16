/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

public class SinglyLinkedList<T> implements LinkedListInterface<T> {
    private Node<T> first;
    private Node<T> last;

    public SinglyLinkedList() {
        this.first = null;
        this.last = null;
    }

    public Node<T> getFirst() {
        return first;
    }

    public Node<T> getLast() {
        return last;
    }

    public void setFirst(Node<T> first) {
        this.first = first;
    }

    public void setLast(Node<T> last) {
        this.last = last;
    }
    
    
    @Override
    public boolean isEmpty() {
        return first == null; 
    }
    
    @Override
    public int size() {        
        if(isEmpty())
            return 0; 
        else{
            int size = 1;
            Node<T> p = first.next;
            while(p != null){
                size++;
                p = p.next;
            }
            return size;
        }
    }
    
    @Override
    public void add(T element) {
        if(isEmpty()){
            first = new Node<>(element);
            last = first;
        }
        else{
            last.next = new Node<>(element);
            last = last.next;
        }
    }

    @Override
    public void insertAt(int index, T element) {
        if(index < 0 || index > size())
            throw new IndexOutOfBoundsException();
        else{
           if(index == 0){
               if(first == last){
                   first = new Node<>(element);
                   last = first.next;
               }
           }
           else{
               Node<T> p = first;
               for(int i=1; i<=index-1;i++)
                   p = p.next;
               p.next = new Node<>(element, p.next);
               if(p == last)
                   last = p.next;
           }
        }
    }

    @Override
    public void remove(T element) {
       
    }

    @Override
    public void removeAt(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void removeAll(T element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
