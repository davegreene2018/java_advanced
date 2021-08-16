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
public class CopyFile {
    
    public static void main (String args[])throws IOException {
        
      FileInputStream infile = null;
      FileOutputStream outfile = null;
      
      try{
          infile = new FileInputStream("C:\\Users\\Daveg\\Google Drive\\College\\Advance programming\\input.txt");
          outfile = new FileOutputStream("C:\\Users\\Daveg\\Google Drive\\College\\Advance programming\\output.txt");
          
          int c;
          
          while((c=infile.read())!= -1){
              outfile.write(c);
          }
      }
      finally{
          
          if(infile !=null){
              infile.close();
          }
          
          if(outfile!=null){
              outfile.close();
          }
          
      }
    }
    
}
