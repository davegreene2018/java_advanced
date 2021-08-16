package DogFac;

public class DogFactory {
	
	   //use getShape method to get object of type shape 
	   public Dog getDog(String dogType){
	      if(dogType == null){
	         return null;
	      }
	      if(dogType.equalsIgnoreCase("Poodle")){
	          return new Poodle();
	 } else if(dogType.equalsIgnoreCase("Rottweiler")){
	          return new Rottweiler();
	 } else if(dogType.equalsIgnoreCase("Siberian husky")){
	          return new Siberian_husky();
	       }
	 return null;
	    }
	 }
