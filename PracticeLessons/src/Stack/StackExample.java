/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 *
 * @author Daveg
 */
public class StackExample {
    
    public static void main(String args[]){
       
        Stack<String> stack = new Stack<>(2);
        stack.push("Hello");
        stack.push("world");
        stack.push("test");
        //System.out.println(stack.toString());
        stack.pop();
        System.out.println(stack.toString());
    }
    
}
