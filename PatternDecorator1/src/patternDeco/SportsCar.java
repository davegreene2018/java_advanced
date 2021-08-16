package patternDeco;


	public class SportsCar extends CarDecorator {

		   public SportsCar(Car sportscar) {
		      super(sportscar);		
		   }

		   @Override
		   public void assemble() {
		      super.assemble();	       
		      System.out.println("Adding Sports Features");
		   }

		   
		  
		}