package OOPSConceptPart2;

public class TestCar {

	public static void main(String[] args) {
		
		// static polymorphism --- compile-time polymorphism
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.theftSafety();
		b.engine();
		
		
		
		
		System.out.println("********************");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		
		

		System.out.println("********************");
		
		//Top Casting
		Car c1 = new BMW(); // child class object can be referred bt parent class reference variabel --- >> Dynamic or Run time polymophism
		c1.start();
		c1.stop();
		c1.refuel();
		
		//Down Casting
		BMW b1 = (BMW)new Car(); //ClassCastException
		
		
		
		
		
		
		

	}

}
