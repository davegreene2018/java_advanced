/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

public class DoublyLinkedListExemple {
    public static void main(String[] args) {
        DoublyLinkedList<String> list = new DoublyLinkedList<>();
        list.add("Red");
        list.add("Blue");
        list.add("White");
        list.insertAt(0, "Orange");
        list.insertAt(2, "White");
        System.out.println("Before removal: ");
        System.out.println(list.size());
        System.out.println(list.toString());
        list.removeAll("White");
        System.out.println("After removal: ");
        System.out.println(list.size());
        System.out.println(list.toString());
        System.out.println("After clear: ");
        list.clear();
        System.out.println(list.toString());
    }
    
}
