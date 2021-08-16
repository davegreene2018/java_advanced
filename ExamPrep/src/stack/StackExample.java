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
public class StackExample {
    
    public static void main (String args[]){
        ArrayStack<String> stack = new ArrayStack<>(10);
        
        stack.push("dave");
        stack.push("Greene");
        stack.push("dave");
        stack.push("Greene");
        stack.push("Greene");
        stack.pop();
        System.out.println("Size is " + stack.size());
        
        System.out.println(stack.toString());
        
    }
    
}
