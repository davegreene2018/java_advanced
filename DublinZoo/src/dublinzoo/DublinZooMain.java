/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dublinzoo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author x18127487
 */
public class DublinZooMain {
    
     public static void main(String[] args) throws IOException {
         
        
         ArrayList<String> list = new ArrayList<String>();
         ArrayList<String> show = new ArrayList<String>();
         
         
	 BufferedWriter buffer = null;
	 BufferedReader in = null;
	 FileWriter writer = null;
         
         try{
         InputStreamReader r = new InputStreamReader(System.in);
         BufferedReader br = new BufferedReader(r);
         
         System.out.println("Please enter your name");
         String name = br.readLine();
         list.add(name);
         
         System.out.println("Please enter how many shows max 2");
         String shows = br.readLine();
         show.add(shows);
         
        
         writer = new FileWriter("src/dublinZooInput.txt", true); 
         writer.write(name);
         writer.write(shows);
         writer.write(" ");
         
         
         FileReader fr = new FileReader ("src/dublinZooOutput.txt");
         BufferedReader br2 = new BufferedReader(fr);
         
         int i;
         while((i=br2.read())!=-1){
             System.out.println((char)i);
         }
         br2.close();
         fr.close();
         
       
         
             //System.out.println("name" + list);
             //System.out.println("shows" + shows); 
         
         
         
      } // default exception
          catch (IOException e) {
          System.out.print("Exception");
      }
         // null pointer exception
         catch(NullPointerException e) 
        { 
            System.out.print("NullPointerException Caught"); 
        } 
      finally {
          // close our file writer
          writer.close();
         
          System.out.println("Success");
      }
   }
     
     
     }
        
        
    
    

