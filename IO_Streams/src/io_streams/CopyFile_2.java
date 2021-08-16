/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io_streams;

import java.io.*;

/**
 *
 * @author Daveg
 */
public class CopyFile_2 {
    
    public static void main(String args[]){
        
        FileReader infile = null;
        FileWriter outfile = null;
        
        try{
            infile = new FileReader("C:\\Users\\Daveg\\Google Drive\\College\\Advance programming\\input.txt");
            outfile = new FileWriter("C:\\Users\\Daveg\\Google Drive\\College\\Advance programming\\output.txt");
            
        }
        
        finally {
            
        }
        
    }
    
}
