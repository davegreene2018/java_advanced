/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

public class DoublyLinkedList<T> implements LinkedListInterface<T> {

    private DLNode<T> first;
    private DLNode<T> last;

    public DoublyLinkedList() {
        this.first = null;
        this.last = null;
    }

    public DLNode<T> getFirst() {
        return first;
    }

    public DLNode<T> getLast() {
        return last;
    }

    public void setFirst(DLNode<T> first) {
        this.first = first;
    }

    public void setLast(DLNode<T> last) {
        this.last = last;
    }
    
    @Override
    public void add(T element) {
       //if list is empty, prepend the new element to the list 
       if(isEmpty()){
           first = new DLNode<>(element);
           last = first;
       }
       //otherwise, append the new element to the list
       else{
          last.next = new DLNode<>(element,last,null);
          last = last.next;
       }
    }

    @Override
    public void insertAt(int index, T element) {
        //check if index is out of bound
        if(index < 0 || index > size())
            throw new IndexOutOfBoundsException();
        //index = 0
        else if(index == 0){
            //if list is empty
            if(isEmpty()){
                first = new DLNode<>(element);
                last = first;
            }
            //if list has elements
            else{
              first = new DLNode<>(element, null, first);
              first.next.prev = first;
            }    
        }
        //index != 0 
        else{
            //create a pointer and traverse the list till index
            DLNode<T> p = first;
            for(int i = 1; i<= index-1; i++)
                p = p.next;
            //if index is the last element in the list
            if(p == last){
                p.next = new DLNode<>(element,p,null);
                last = p.next;
            }
            //if index is not the last element in the list
            else{
                p.next = new DLNode<>(element,p,p.next);
                p.next.next.prev = p.next;
            }    
        }
    }

    @Override
    public void remove(T element) {
        //case 1: element is the first element in the list
        if(first.element == element){
            first = first.next;
            first.prev = null;
            if(first.next == null)
                last = first;
        }
        //case 2: element is not the first in the list - traverse 
        else{
            DLNode<T> p = first.next;
            while(p != null){
                if(p.element == element){
                    //element is the last element in the list, set next pointer of the previous element
                    if(p.next == null){
                        p.prev.next = null;
                        last = p.prev; 
                    }
                    //set the pointers of the predecessor and the next node
                    p.prev.next = p.next;
                    p.next.prev = p.prev;
                    return;
                }
                p = p.next;
            }
            System.out.println("Element does't exit OR list is empty!");
        }
    }

    @Override
    public void removeAt(int index) {
       
    }

    @Override
    public void removeAll(T element) {
        boolean flag = false;
        DLNode<T> p = first;
        //traverse the list
        while(p != null){
            //check for element
            if(p.element == element){
                flag = true;
                //if it is the first element in the list
                if(p == first){
                    first = first.next;
                    first.prev = null;
                }
                //otherwise
                else{
                    p.prev.next = p.next;
                    //if p is the last element, set last to the p.prev
                    if(p.next == null)
                        last = p.prev;
                    else 
                        p.next.prev = p.prev;
                }
            }
            p = p.next;
        }
        if(!flag)
            System.out.println("Element doesn't exist in the list");
    }
    
    public void clear(){
        first = null;
    }

    @Override
    public int size() {
        //if list is empty, size = 0
        if(isEmpty())
            return 0;
        else{
            //there is at least one element in the list
            int size = 1;
            DLNode<T> p = first.next;
            //traverse the list using p and increment the size 
            while(p != null){
                size++;
                p = p.next;
            }
            return size;
        }
    }

    @Override
    public boolean isEmpty() {
       //check if first is null. If yes, return true 
       return first == null;
    }
    
    @Override
    public String toString() {
        String str = "";
        DLNode<T> p = first;
        while (p != null){
            str += p.toString() + "\n";
            p = p.next;
        }
        return str;
    }
}
