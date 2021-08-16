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
public class Read_from_file {
    
    public static void main(String args[]) throws Exception{
        
        FileReader fr = new FileReader("read_from_file.txt");
        BufferedReader in = new BufferedReader(fr);
        
        String newLine = in.readLine();
        
        char letter = (char)in.read(); // reads one character at a time
        while(letter !=-1){
            System.out.println(newLine);
           
        }
        
        in.close();
        
    }
    
}
