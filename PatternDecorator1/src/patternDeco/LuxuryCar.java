package patternDeco;


	public class LuxuryCar extends CarDecorator {

		   public LuxuryCar(Car luxurycar) {
		      super(luxurycar);		
		   }

		   @Override
		   public void assemble() {
		      super.assemble();	       
		      System.out.println("Adding Luxury Features");
		   }

		   
		  
		}