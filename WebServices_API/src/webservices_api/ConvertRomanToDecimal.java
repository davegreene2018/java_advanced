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
public class ConvertRomanToDecimal {
    



    public static void main(String[] args) {
        
        // Create a scanner for input
        Scanner in = new Scanner(System.in);
        //Promt the user to enter roman numeral
        System.out.print("Enter a Roman numeral: ");
        // save the input in string r
        String R = in.nextLine();
        //Print out the reult
        System.out.println("Converted to Decimal: " + RomanToDecimal(R));
    }
    // create a method for looping through string and converting to decimal
    static int RomanToDecimal(String R) {
        int Decimal = 0;
        char Previous = 0;

        for (int x = 0; x < R.length(); x++) {
            if (R.charAt(x) == 'I')
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
        // return the converted string to decimal
        return Decimal;

    }
}