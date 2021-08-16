/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reverse;

/**
 *
 * @author Daveg
 */
public class Reverse {
    
    public static void main (String args[]){
    
            reverseString("David Greene");
            nestparen("())");
        
        
       
}
    public static void reverseString(String s){
        reverseString(s, s.length()-1);
    }
    
    public static void reverseString(String s, int index){
        if(index<0)
            return;
        System.out.println(s.charAt(index));
        reverseString(s, index-1);
    }
    
    public static boolean nestparen(String s){
        if((s.length() % 2)!=0){
            return false;
        }
        else if(s.length() ==0){
            return true;
        }
        else {
            return nestparen(s.substring(1, s.length()-1))&& (s.charAt(0)=='(' && s.charAt(s.length()-1)==')');
        }
    }
     
}
