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
public class Student {
       
        int a;
	boolean b;
	short s;
	float f;
	double d;

	public Student()
	{
	}
	public Student(int _a, boolean _b, short _s, float _f, double _d)
	{
		a = _a;
		b = _b;
		s = _s;
		f = _f;
		d = _d;
	}
	// override the toString method and print out all the field member values
	
	public void display()
	{
		System.out.println("a="+a+ " b="+b +" s="+s+ " f="+f+ " d="+d );
	}
}
    

