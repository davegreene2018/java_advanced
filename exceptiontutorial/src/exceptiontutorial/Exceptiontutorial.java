/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptiontutorial;

import java.util.Random;

/**
 *
 * @author Daveg
 */
public class Exceptiontutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //QUESTION 1 and 2
        int num1, num2;
        try { 
           // Try block to handle code that may cause exception
           num1 = 0;
           num2 = 62 / num1;
           System.out.println("Try block message, result: "+num2);
        } 
        catch (ArithmeticException e) { 
               // This block is to catch divide-by-zero error
               System.out.println("Error: Don't divide a number by zero \n"+e);
        }
        
        //QUESTION 3 and 4
        try {
            int a[]=new int[99];//declaration and instantiation.
            Random rand = new Random();
            int n;

            for(int i = 0; i<99; i++){
           n = rand.nextInt(20) + 1;
           
             a[i] = n;
            }
            System.out.println(a[99]);
        }
        catch(ArrayIndexOutOfBoundsException exception) {
            System.out.println("Error not in array \n"+exception);
        }
    }
    }
    
