package DogFac;
import java.util.Scanner;

public class FactoryPatternDemo {

	   public static void main(String[] args) {
	      DogFactory dogFactory = new DogFactory();
	      System.out.println("Enter type of dog");
	      Scanner myObj = new Scanner(System.in);
	      String userOption = myObj.nextLine();
	      
	      Dog dog1;
	    //get an object of Poodle and call its price method.
	      if( userOption.equalsIgnoreCase("Poodle")){
	     dog1 = dogFactory.getDog("Poodle");
	      //call price method of Poodle
	      dog1.price();
	      }
	      else if( userOption.equalsIgnoreCase("Rottweiler")){
	      //get an object of Poodle and call its price method
	      dog1 = dogFactory.getDog("Rottweiler");
	      dog1.price();
	      }
	      else if( userOption.equalsIgnoreCase("Siberian husky")){
	      dog1 = dogFactory.getDog("Siberian husky");
	      dog1.price();
	      }
	      else
	    	  System.out.println("No such a type of Dog");
	   }
	}
