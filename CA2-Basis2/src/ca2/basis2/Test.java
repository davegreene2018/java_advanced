/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca2.basis;

/**
 *
 * @author Daveg
 */
public class Test {
    
    public static void main(String[] args) {
        ArrayListStack<String> stack = new ArrayListStack<>();
        //stack.duplicateVowels("Hello");
        stack.ReverseString("World");
        System.out.println(stack.toString());
        
        stack.duplicateVowels("World");
        System.out.println(stack.toString());
        
    }
    
}
