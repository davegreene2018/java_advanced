/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.romannumeralconverter;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/converter")
public class romanConverter {
    
    
    //separate paths for String or Decimal parameters
    @GET
    @Path("roman/{param}")
    public Response romanToDecimal(@PathParam("param") String R) {
        
        double Decimal = 0;
        char Previous = 0;

        for (int x = 0; x < R.length(); x++) {
            if (R.charAt(x) == 'I') //if statements determine what value is to be added to Decimal based on the letter in the String at x
                Decimal += 1;

            if (R.charAt(x) == 'V') {
                System.out.println(Previous);
                if (Previous == 'I') {
                    Decimal -= 2;
                }
                Decimal += 5;
            }

            if (R.charAt(x) == 'X') {
                if (Previous == 'I') {
                    Decimal -= 2;
                }
                Decimal += 10;
            }

            if (R.charAt(x) == 'L') {
                if (Previous == 'X') {
                    Decimal -= 20;
                }
                Decimal += 50;
            }

            if (R.charAt(x) == 'C') {
                if (Previous == 'X') {
                    Decimal -= 20;
                }
                Decimal += 100;
            }

            if (R.charAt(x) == 'D') {
                if (Previous == 'C') {
                    Decimal -= 200;
                }
                Decimal += 500;
            }

            if (R.charAt(x) == 'M') {
                if (Previous == 'C') {
                    Decimal -= 200;
                }
                Decimal += 1000;
            }
            Previous = R.charAt(x);
        }
  
        String output = R + "\t" + "Roman to Decimal =" + String.valueOf(Decimal); //display 
        return Response.status(200).entity(output).build();
    }
        
        
    @GET
    @Path("decimal/{param}") 
    public Response decimalToRoman(@PathParam("param") Double Decimal) {
        
     
    String s ="";
    final Double displayDec = Decimal; //retain original decimal for dislay

    while (Decimal >= 1000) {
        s += "M";
        Decimal -= 1000;        
    } while (Decimal >= 900) {
        s += "CM";
        Decimal -= 900;
    } while (Decimal >= 500) {
        s += "D";
        Decimal -= 500;
    } while (Decimal >= 400) {
        s += "CD";
        Decimal -= 400;
    } while (Decimal >= 100) {
        s += "C";
        Decimal -= 100;
    } while (Decimal >= 90) {
        s += "XC";
        Decimal -= 90;
    } while (Decimal >= 50) {
        s += "L";
        Decimal -= 50;
    } while (Decimal >= 40) {
        s += "XL";
        Decimal -= 40;
    } while (Decimal >= 10) {
        s += "X";
        Decimal -= 10;
    } while (Decimal >= 9) {
        s += "IX";
        Decimal -= 9;
    } while (Decimal >= 5) {
        s += "V";
        Decimal -= 5;
    } while (Decimal >= 4) {
        s += "IV";
        Decimal -= 4;
    } while (Decimal >= 1) {
        s += "I";
        Decimal -= 1;
    }

        String output = displayDec + "\t" + "Decimal to Roman =" + String.valueOf(s);   //display
        return Response.status(200).entity(output).build();
    }
}

