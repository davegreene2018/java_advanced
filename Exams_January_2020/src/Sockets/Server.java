/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sockets;

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
public class Server {
    
     public static void main(String[] args) throws IOException{
         
         // create the server socket
         ServerSocket serverSocket = new ServerSocket(2016, 10);
         
         // wait for a connection
         System.out.println("Waiting for connection...");
         
         Socket clientSocket = serverSocket.accept();
         System.out.println("Connection recieved from "+clientSocket.getInetAddress().getHostName());
         
         // get input and output
         PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
         BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
         
         // communicate via input and output streams
         
            // write to client
            out.println("Welcome to my server");
            
            // get message from the client
            String fromClient = in.readLine();
            System.out.println("From client "+fromClient);
            
            // close
            out.close();
            in.close();
            serverSocket.close();
     }
    
}
