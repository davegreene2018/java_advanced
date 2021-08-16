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
public class BlackForrest implements Cake {

    @Override
    public void name() {
       System.out.println("BlackForrest.");
    }

    @Override
    public void type() {
        System.out.println("Contains Eggs, berrys and cream");
    }

    @Override
    public void price() {
        System.out.println("Price of Black Forrest is �40.");
    }

    
}
