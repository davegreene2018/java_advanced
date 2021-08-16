/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

public class SinglyLinkedListExample {
    public static void main(String[] args) {
        SinglyLinkedList<String> list = new SinglyLinkedList<>();
        //System.out.println(list.isEmpty());
        //System.out.println(list.size());
        list.add("Red");
        list.add("Blue");
        list.add("White");
        list.insertAt(2, "Orange");
        //System.out.println(list.contains("White"));
        System.out.println(list.size());
        Node<String> p = list.getFirst();
        for (int i = 0; i < list.size(); i++){
            System.out.println(p.element);
            p = p.next;
        }
        list.remove("White");
        System.out.println("---------------");
        p = list.getFirst();
        for (int i = 0; i < list.size(); i++){
            System.out.println(p.element);
            p = p.next;
        }
        
    }
    
}
