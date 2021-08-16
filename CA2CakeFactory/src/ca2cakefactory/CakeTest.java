/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca2cakefactory;

import java.util.Scanner;

/**
 *
 * @author Daveg
 */
public class CakeTest {
    
    public static void main(String[] args) {
	      CakeFactory cakeFactory = new CakeFactory();
	      System.out.println("Enter type of cake");
	      Scanner myObj = new Scanner(System.in); // get user input
	      String userOption = myObj.nextLine();
	      
	      Cake cake1;
	    //get an object of BlackForrest and call its name, type and price method.
	      if( userOption.equalsIgnoreCase("BlackForrest")){
	     cake1 = cakeFactory.getCake("BlackForrest");
	      //call price method of Poodle
	      cake1.name();
              cake1.type();
              cake1.price();
	      }
	      else if( userOption.equalsIgnoreCase("BlueBerry")){
	      //get an object of BlueBerry and call its name, type and price method.
	      cake1 = cakeFactory.getCake("BlueBerry");
	      cake1.name();
              cake1.type();
              cake1.price();
	      }
	      else if( userOption.equalsIgnoreCase("LitchiGateaux")){
              //get an object of LitchiGateaux and call its name, type and price method.
	      cake1 = cakeFactory.getCake("LitchiGateaux");
	      cake1.name();
              cake1.type();
              cake1.price();
	      }
              else if( userOption.equalsIgnoreCase("Pineapple")){
              //get an object of Pineapple and call its name, type and price method.
	      cake1 = cakeFactory.getCake("Pineapple");
	      cake1.name();
              cake1.type();
              cake1.price();
	      }
              // error handling if there is no such cake
	      else
	    	  System.out.println("No such a type of Cake");
	   }
    
}
