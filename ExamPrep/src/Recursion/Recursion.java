/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

/**
 *
 * @author Daveg
 */
public class Recursion {
    
    public static void main (String args[]){
        // factorial
        System.out.println("Factorial " + factorial(6));
        
        // fib
        System.out.println("Fib "+ fib(8));
        
         // reverse
        print("davegreene");
        
    }
    // factorial method
    public static int factorial(int n){
        if(n<=1)
            return 1;
        return  n*factorial(n-1); 
        
    }
    // fib method
    public static int fib(int n){
        if(n<=1)
            return n;
        return fib(n-1) + fib(n-2);
    }
    
     // reverse string
    public static void print(String s){
        print(s, s.length()-1);
    }
    
    public static void print(String s, int index){
        if(index<0)
            return;
        else{
            System.out.println(s.charAt(index));
            print(s,index-1);
        }
            
        
    }
    
}
