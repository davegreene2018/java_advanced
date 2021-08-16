/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparable;

/**
 *
 * @author Daveg
 */
public class Car implements Comparable<Car>{
    
    public String carModel;
    public int year;

    public Car(String carModel, int year) {
        this.carModel = carModel;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" + "carModel=" + carModel + ", year=" + year + '}';
    }
    
    

    @Override
    public int compareTo(Car o) {
        String name = carModel;
        String nameO = o.carModel;
        System.out.println("I am comparing " + name + " with " + nameO);
        if(name.length() == nameO.length())
            return 0;
        else 
            return 1;
    }
    
}
