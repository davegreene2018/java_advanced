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
public class ReadConsole {
    
    public static void main(String args[]) throws IOException {
        
        InputStreamReader cin = null;
        
        try{
            cin = new InputStreamReader(System.in);
            System.out.println("Enter q to exit");
            char c;
            
            do{
                c = (char)cin.read();
                System.out.println(c);
                
            }while(c!='q');
            
        }
        finally{
            if(cin!=null){
                cin.close();
            }
            
        }
        
    }
    
}
        
        
