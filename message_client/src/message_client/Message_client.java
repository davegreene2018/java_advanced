/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package message_client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *
 * @author User
 */
public class Message_client {
    private static InetAddress host;
    private static final int PORT = 1234;
    
    public static void main(String args []){
        try{
            host = InetAddress.getLocalHost();
        }catch (UnknownHostException e){
            System.out.println("Host ID not found!");
            System.exit(1);
        }
        run();
    }    
     
    private static void run(){
        Socket link = null;
        try{
            link = new Socket(host, PORT); 
            //set up for communication with the server
            BufferedReader in = new BufferedReader(new InputStreamReader(link.getInputStream()));

            PrintWriter out = new PrintWriter(link.getOutputStream(), true ) ;
            
            //set up for communication with the user
            BufferedReader userEntry = new BufferedReader(new InputStreamReader(System.in));

            String message = null;
            String response = null;
            
            do{
                //fetch the message from the user
                System.out.println("Enter message: ");
                message = userEntry.readLine();
                
                //send message to the server
                out.println(message);
                
                //fetch the servers response and print to screen
                response = in.readLine();
                System.out.println("\nSERVER>> " + response);
                
            }while(!message.equals("***CLOSE***"));
    
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try{
                System.out.println("\n* Closing connection....*");
                link.close();
            }catch(IOException e){
            System.out.println("Unable to disconnect!");
            System.exit(1);                
            }
        }
    }
}