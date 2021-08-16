/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Compare;

/**
 *
 * @author Daveg
 */
public class Person implements Comparable <Person>{
    
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + '}';
    }
    
    

    @Override
    public int compareTo(Person o) {
        // if they are equal then return 0
        if(age ==o.age)
            return 0;
        // if it is greater return 1
        else if(age> o.age)
            return 1;
        else 
            return -1;
    
    }
    
    public List<T> bubbleSort(List<T> list){
        
    }

    
}
