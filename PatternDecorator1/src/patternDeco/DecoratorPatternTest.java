package patternDeco;

public class DecoratorPatternTest {
	public static void main(String[] args) {
		
		Car car = new BasicCar();
	      System.out.println("BasicCar");
	      car.assemble();
	      System.out.println("\n**********");
	      
	      Car carSports = new SportsCar(car);
	      System.out.println("SportsCar");
	      carSports.assemble();
	      System.out.println("\n**********");
	      
	      Car sportsLuxuryCar = new LuxuryCar(carSports);
	      System.out.println("SportsLuxuryCar");
	      sportsLuxuryCar.assemble();
	      
	        }
}
