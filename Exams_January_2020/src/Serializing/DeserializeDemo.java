/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serializing;

import java.io.*;

/**
 *
 * @author Daveg
 */
public class DeserializeDemo {
    
        public static void main(String [] args) throws Exception {
	//Employee e;
	FileInputStream fileIn = new FileInputStream("employee.ser");  	
        ObjectInputStream in = new ObjectInputStream(fileIn);
	Employee e = (Employee) in.readObject();
	in.close();  fileIn.close();

	System.out.println("Deserialized Employee...");  	
        System.out.println("Name: " + e.name);  	
        System.out.println("Address: " + e.address);  	
        System.out.println("PSN: " + e.PSN); 
        System.out.println("Number: " + e.number);
     }

    
}
