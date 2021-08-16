package PersonFactory;

import java.util.HashMap;

class Person  {   
   String name;

   public Person(String name){
        this.name = name;
   }
   public void setName(String name){
        this.name = name;
   }
   public String getName(){
        return name; 
   }
}

class Male extends Person {   

    public Male(String name) {
        super(name);
        System.out.println("a man has been created with name:"+name);
    }
}

class Female extends Person{   

    public Female(String name) {
        super(name);
        System.out.print("a woman has been created with name:"+name);
    }
}

class PersonFactory {
     private static HashMap<String,Person> factory = new HashMap<String,Person>();
     static {
        factory.put("male", new Male ("Donald Trump"));
        factory.put("female", new Female ("Theresa May"));

     }
     public static Person makePerson(String type) {                                        
         return factory.get(type);                     
     }
}


public class Test {
    public static void main(String[] args){
       Person y= PersonFactory.makePerson("male");  
       Person z= PersonFactory.makePerson("female");
    }
}