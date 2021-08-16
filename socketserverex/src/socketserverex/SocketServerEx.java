/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package socketserverex;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author JT
 */
public class SocketServerEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        // Create the server socket
        ServerSocket serverSocket = new ServerSocket(2016, 10);

        //2.Wait for connection
        System.out.println("Waiting for connection");
        Socket clientSocket = serverSocket.accept();  
        System.out.println("Connection received from " +
        clientSocket.getInetAddress().getHostName());
        //3. Get Input and Output streams  
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new  InputStreamReader(clientSocket.getInputStream()));
        //4.The two parts communicate via the input and output streams

        // write to client (through PrintWriter object)
        out.println("Welcome to my server!");

// get message from client (through BufferedReader object)  
        String fromClient = in.readLine();  
        System.out.println("From client: "+fromClient);
        out.close();
        in.close();  
        serverSocket.close();


    }
}