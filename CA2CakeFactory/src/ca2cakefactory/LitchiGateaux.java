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
public class LitchiGateaux implements Cake {

    @Override
    public void name() {
       System.out.println("LitchiGateaux.");
    }

    @Override
    public void type() {
        System.out.println("Does not contains Eggs");
    }

    @Override
    public void price() {
        System.out.println("Price of LitchiGateaux is �60.");
    }
    
}
