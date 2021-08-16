/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author Daveg
 */
public class QueueExample {
    
    public static void main(String args []){
        
        LinkedQueue<String> queue = new LinkedQueue<>();
        
        queue.enqueue("dave");
        queue.enqueue("greene");
        System.out.println("Peek");
        System.out.println(queue.peek());
        
        System.out.println(queue.toString());
    }
    
}
