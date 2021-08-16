/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package socketclientex;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.io.PrintWriter;

/**
 *
 * @author JT
 */
public class SocketClientEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        Socket requestSocket = new Socket("localhost", 2016); 
        System.out.println("Connected to localhost on port 2016");
        //2. get Input and Output streams
        PrintWriter out = new PrintWriter(requestSocket.getOutputStream(), true); 
        BufferedReader in = new BufferedReader(new InputStreamReader(requestSocket.getInputStream()));
        
        //3: Communicating with the server

        // read line from server (will wait until server sends something!)
        String fromServer = in.readLine();
// print what you�ve just received to the terminal  
        System.out.println("Connected to: "+fromServer);
// send a message to server!  
        out.println("Message from Client :) ");
        
        // Don�t forget to close all streams and connections!
        out.close();
        in.close();  
        requestSocket.close();




    }
}