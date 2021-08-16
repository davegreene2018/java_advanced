/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservices_api;

import java.util.Scanner;

/**
 *
 * @author Daveg
 */
public class CovertDecimalToRoman {
    

    public static void main(String[] args) {
        
        //Create a scanner for input
        Scanner sc =new Scanner(System.in);
        
        //Promt the user to enter a year
        System.out.println("Please enter a year:");
        
        //int yearInteger 
        int yearInteger=sc.nextInt();
        //int year for final output
        int year = yearInteger;
        
        //Declare a Sring yearRoman = null
        String yearRoman="";
        //while the variable is less than zero, give an exception message
        if (yearInteger < 1 ){
        System.out.println("Number can't be zero or negative");
        }
        
        //while loops for checking the year and adding to string yearRoman
        // if year greater then 100 append M to string and subtract 1000
        while(yearInteger>=1000){
            yearRoman +="M";
            yearInteger-=1000;
        }
         // if year greater then or = 900 append CM to string and subtract 900
        while(yearInteger>=900){
            yearRoman +="CM";
            yearInteger-=900;
        }
        // if year greater then or = 500 append D to string and subtract 500
        while(yearInteger>=500){
            yearRoman +="D";
            yearInteger-=500;
        }
        // if year greater then or = 400 append CD to string and subtract 400
         while(yearInteger>=400){
            yearRoman +="CD";
            yearInteger-=400;
         }
         // if year greater then or = 100 append C to string and subtract 100
        while(yearInteger>=100){
            yearRoman +="C";
            yearInteger-=100;
        }
        // if year greater then or = 90 append XC to string and subtract 90
        while(yearInteger>=90){
            yearRoman +="XC";
            yearInteger-=90;
        }
        // if year greater then or = 50 append L to string and subtract 50
        while(yearInteger>=50){
            yearRoman +="L";
            yearInteger-=50;   
        }
        // if year greater then or = 40 append XL to string and subtract 40
        while(yearInteger>=40){
            yearRoman +="XL";
            yearInteger-=40; 
        }
        // if year greater then or = 10 append X to string and subtract 10
        while(yearInteger>=10){
            yearRoman +="X";
            yearInteger-=10;
        }
        // if year greater then or = 9 append IX to string and subtract 9
        while(yearInteger>=9){
            yearRoman +="IX";
            yearInteger-=9;
        }
        // if year greater then or = 5 append V to string and subtract 5
        while(yearInteger>=5){
            yearRoman +="V";
            yearInteger-=5;
        }
        // if year greater then or = 4 append IV to string and subtract 4
        while(yearInteger>=4){
           yearRoman +="IV";
           yearInteger-=4;    
        }
        // if year greater then or = 1 append I to string and subtract 1
        while(yearInteger>=1){
            yearRoman +="I";
            yearInteger-=1;  
        }
        //Print out the final result
        System.out.println(year + " = "+ yearRoman + " in roman numeral");
    }
    
 
}