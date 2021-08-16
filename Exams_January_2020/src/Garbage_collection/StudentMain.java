/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Garbage_collection;

/**
 *
 * @author Daveg
 */
public class StudentMain {
    
    public static void main(String args[]){
	Student s1 = new Student();
	Student s2 = new Student(11, true, (short) 0, (float) 11.44, 44.66);
	s1.display();
	s2.display();
	}
    
}
