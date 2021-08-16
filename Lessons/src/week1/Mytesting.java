/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1;

import java.util.ArrayList;

/**
 *
 * @author Daveg
 */
public class Mytesting {
    
    public static void main(String args[]){
        
        ArrayList<String> list = new ArrayList<>();
        list.add("Dave");
        list.add("Claire");
        list.add(1, "Lee");
        
        int size = list.size();
        
        System.out.println(list);
        System.out.println(size);
            
        
    }
    
}
