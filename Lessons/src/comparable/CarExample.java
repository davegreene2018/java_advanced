/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparable;

import java.util.ArrayList;
import java.util.Collections;



/**
 *
 * @author Daveg
 */
public class CarExample {
    
    public static void main(String args[]){
        
        ArrayList<Car> car = new ArrayList<>();
        car.add(new Car ("Toyota", 2019));
        car.add(new Car ("Audi", 2018));
        car.add(new Car("Tesla", 2017));
        
        Collections.sort(car);
        
        for (Car car1 : car)
            System.out.println(car1);
        
    }
    
}
