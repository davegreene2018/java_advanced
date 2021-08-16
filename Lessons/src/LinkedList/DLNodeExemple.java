/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

public class DLNodeExemple {
    public static void main(String[] args) {
        DLNode<String> node = new DLNode<>("A");
        node.next = new DLNode<>("B", node, null);
   
        System.out.println(node.toString());
    }
    
}
