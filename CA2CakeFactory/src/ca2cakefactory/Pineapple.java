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
public class Pineapple implements Cake {

    @Override
    public void name() {
       System.out.println("Pineapple.");
    }

    @Override
    public void type() {
        System.out.println("Contains Eggs and pineapple");
    }

    @Override
    public void price() {
        System.out.println("Price of Pineapple is �55.");
    }
    
}
