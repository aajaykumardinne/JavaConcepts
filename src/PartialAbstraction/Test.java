package PartialAbstraction;

public class Test extends Shape{

	
	public Test() {
		System.out.println("Test class constructor");
	}
	public static void main(String[] args) {
		
//		Shape s = new Test();
//		s.drawing();
//		s.fill();
		Test t = new Test();

	}

	@Override
	void drawing() {
		System.out.println("Test -- drawing");
		
	}

}
