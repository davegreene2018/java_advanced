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
public class BlueBerry implements Cake {

    @Override
    public void name() {
       System.out.println("BlueBerry.");
    }

    @Override
    public void type() {
        System.out.println("Contains Eggs and berrys");
    }

    @Override
    public void price() {
        System.out.println("Price of BlueBerry is �50.");
    }
    
}
