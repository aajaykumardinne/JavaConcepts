package OOPSConceptPart1;

public class Car {

	// class vars
	int mod;
	int wheel;
	
	public static void main(String[] args) {

	
		// right hand side part is called object  i.e new Car(); 
		// and c1 is the object reference variable.
		// new keyword is used to create the object
		// c1,c2,c3 are called the object reference variables.
		
		
		Car c1 = new Car(); 
		Car c2 = new Car();
		Car c3 = new Car();
		
		c1.mod = 2015;
		c1.wheel = 4;
		
		c2.mod = 2014;
		c2.wheel =4;
		
		c3.mod = 2013;
		c3.wheel = 4;
		
		
		System.out.println("before assigning the references");
		
		
		System.out.println(c1.mod);
		System.out.println(c1.wheel);
		
		System.out.println(c2.mod);
		System.out.println(c2.wheel);
		
		
		System.out.println(c3.mod);
		System.out.println(c3.wheel);
		
		
		System.out.println("after assigning the references");
		
		
		c1=c2;
		c2=c3;
		c3=c1;
		
		c1.mod = 10;
		System.out.println(c1.mod);  // 10
		
		c3.mod = 20;
		System.out.println(c1.mod);  // 20
		System.out.println(c3.mod);

		
		System.out.println(c2.mod);  // c2 is referred to  c3 hence the value of c3.mod will be printed.
		
		
		
		
		

	}

}
