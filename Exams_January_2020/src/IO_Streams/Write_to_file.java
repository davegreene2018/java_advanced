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
public class Write_to_file {
    
       public static void main(String args[]) throws Exception{
           
           FileWriter fr = new FileWriter ("write_to_file.txt",true); // set append to true 
           BufferedWriter out = new BufferedWriter(fr);
           
           out.write("Hello");
           out.newLine();
           out.close();
       }
    
}
