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
public class SerializingDemo {
    
    public static void main(String [] args) throws Exception {
    
    Employee e = new Employee();
    e.name = "Glen Ward";
    e.address = "Yellow Brick Road";  
    e.PSN = 11122333;
    e.number = 101;

     FileOutputStream fileOut = new FileOutputStream("employee.ser");  ObjectOutputStream out = new ObjectOutputStream(fileOut);  out.writeObject(e);
     
     out.close();  
     fileOut.close();
     
     System.out.println("Serialized data is saved in employee.ser");
   
    }

}
