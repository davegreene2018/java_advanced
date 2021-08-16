/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

import java.util.ArrayList;

/**
 *
 * @author Daveg
 */
public class ExceptionHandling {
    
    public static void main (String args[]){
        
        ArrayList<String> favouriteWords = new ArrayList<>();
        
        try {
            favouriteWords.add("dave");
            favouriteWords.add("greene");
            
            String name = favouriteWords.get(3);
            
        }
        
        catch (IndexOutOfBoundsException e){
            System.out.println("Eception caught "+e);
        }
    }
    
}
