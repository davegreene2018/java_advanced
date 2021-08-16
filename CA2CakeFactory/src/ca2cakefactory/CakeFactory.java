/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca2cakefactory;

/**
 *
 * @author Daveg
 */
public class CakeFactory {
    
      public Cake getCake(String cakeType){
	      if(cakeType == null){
	         return null;
	      }
	      if(cakeType.equalsIgnoreCase("BlackForrest")){
	          return new BlackForrest();
	 } else if(cakeType.equalsIgnoreCase("BlueBerry")){
	          return new BlueBerry();
	 } else if(cakeType.equalsIgnoreCase("LitchiGateaux")){
	          return new LitchiGateaux();
	       }else if(cakeType.equalsIgnoreCase("Pineapple")){
	          return new Pineapple();
	       }
         
	 return null;
	    }
    
}
