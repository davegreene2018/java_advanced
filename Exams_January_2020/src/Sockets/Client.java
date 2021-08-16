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
import java.net.Socket;

/**
 *
 * @author Daveg
 */
public class Client {
    
    public static void main(String[] args) throws IOException{
        
    // create the socket
    Socket requestSocket = new Socket("localhost",2016);
    System.out.println("Connected to localhost on port 2016");
    
    
    // get input and output
    PrintWriter out = new PrintWriter(requestSocket.getOutputStream(), true);
    BufferedReader in = new BufferedReader(new InputStreamReader(requestSocket.getInputStream()));
    
    // Communicate with the server
    
        // read from the server
        String fromServer = in.readLine();
        // print what we got
        System.out.println("Connected to server "+fromServer);
        // sent a message to the server
        out.println("Message from client");
    
    // close
    out.close();
    in.close();
    requestSocket.close();
    
    }
}
