/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO_Streams;

import java.io.*;

/**
 *
 * @author Daveg
 */
public class Read_from_console {
    
    public static void main(String args[]) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // promt to enter text
        System.out.println("Please enter text");
        String s = br.readLine();
        
        // return text enetered
        System.out.println("You have entered " + s);
        
    }
    
}
