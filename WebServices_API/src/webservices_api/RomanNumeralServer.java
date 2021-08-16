/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservices_api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Daveg
 */
public class RomanNumeralServer {
    
    private static ServerSocket servSock;
    private static final int PORT = 1234;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            servSock = new ServerSocket (PORT);
        } catch (IOException ex) {
            System.out.println("Unable to attach to port!");
            System.exit(1);
        }
        do {
            run();
        }while(true);
    }
    
    public static void run(){
        Socket link = null;
        try{
            link = servSock.accept();
            
            BufferedReader in = new BufferedReader(new InputStreamReader(link.getInputStream()));
            
            PrintWriter out = new PrintWriter(link.getOutputStream(), true ) ;
            
            int numMessages = 0;
            
            String message = in.readLine();
            
            while(!message.equals("***CLOSE***")){
                System.out.println("Message received: " + message);
                numMessages++;
                out.println("Message " + numMessages + ": " + message);
                message = in.readLine();
            }
            out.println(numMessages + " messages received.");

        } catch(IOException e){
            e.printStackTrace();
        }finally{
        try{
            System.out.println("\n* Closing connection.....*");
            link.close();
            System.exit(0);            
        } catch(IOException e){
            System.out.println("Unable to disconnect!");
            System.exit(1);
        }
        
        }
        }

    
}
